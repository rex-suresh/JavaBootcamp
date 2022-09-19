package com.tw.step8.bootcamp.assignment5;

import com.tw.step8.bootcamp.assignment5.exception.BagReachedMaxCapacityException;
import com.tw.step8.bootcamp.assignment5.exception.CannotContainBothBlueAndBlackBallsException;
import com.tw.step8.bootcamp.assignment5.exception.MaximumLimitReachedForGivenColorException;

import java.util.HashSet;

// As a wizard I’d like a bag that can hold a maximum of 12 magic balls
// As a wizard I’d like a bag that can hold a maximum of 3 green balls
// As a wizard I’d like a bag that prevents me from having more than double the number of red balls as there are green balls
// As a wizard I’d like a bag that only allows  40% of the balls contained to be yellow.
// As a wizard I’d like a bag that allows either blue balls or black balls, but not both

public class Bag {
  private static final int maxCapacity = 12;
  private static final int redBallMultiple = 2;
  private static final double yellowBallMultiple = 0.4;
  private final HashSet<Ball> balls;

  public Bag() {
    balls = new HashSet<>();
  }

  public int add(Ball ball) {
    if (this.isBagFull()) {
      throw new BagReachedMaxCapacityException();
    }

    if (!this.isColorAllowed(ball.color)) {
      throw new CannotContainBothBlueAndBlackBallsException(ball.color);
    }

    int sameColoredBallCount = this.sameColoredBallCount(ball.color);
    if (sameColoredBallCount >= this.getMaxLimit(ball)) {
      throw new MaximumLimitReachedForGivenColorException(ball.color);
    }

    balls.add(ball);
    return balls.size();
  }

  private boolean isColorAllowed(Color color) {
    if (color != Color.BLUE && color != Color.BLACK) {
      return true;
    }

    Color unAllowedColor = color == Color.BLUE ? Color.BLACK : Color.BLUE;
    for (Ball ball : balls) {
      if (ball.color == unAllowedColor) {
        return false;
      }
    }
    return true;
  }

  private boolean isBagFull() {
    return this.balls.size() >= maxCapacity;
  }

  private int getMaxLimit(Ball ball) {
    if (ball.color == Color.RED) {
      int greenColoredBallCount = this.sameColoredBallCount(Color.GREEN);
      return greenColoredBallCount * redBallMultiple;
    }

    if (ball.color == Color.YELLOW) {
      return (int) Math.floor(balls.size() * yellowBallMultiple);
    }
    return ball.color.maxLimit;
  }

  public int sameColoredBallCount(Color color) {
    int sameColorBalls = 0;
    for (Ball ball : balls) {
      if (ball.color == color) {
        sameColorBalls++;
      }
    }
    return sameColorBalls;
  }

}
