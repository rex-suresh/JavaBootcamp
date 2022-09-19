package com.tw.step8.bootcamp.assignment5;

import com.tw.step8.bootcamp.assignment5.exception.BagReachedMaxCapacityException;
import com.tw.step8.bootcamp.assignment5.exception.MaximumLimitOfSameColorBallsReachedException;

import java.util.HashSet;

// As a wizard I’d like a bag that can hold a maximum of 12 magic balls
// As a wizard I’d like a bag that can hold a maximum of 3 green balls

public class Bag {
  private static final int maxCapacity = 12;
  private final HashSet<Ball> balls;

  public Bag() {
    balls = new HashSet<>();
  }

  public int add(Ball ball) {
    Color ballColor = ball.color;
    int sameColoredBallCount = this.sameColoredBallCount(ballColor);

    if (sameColoredBallCount >= ballColor.maxLimit) {
      throw new MaximumLimitOfSameColorBallsReachedException(ballColor);
    }

    if (balls.size() >= maxCapacity) {
      throw new BagReachedMaxCapacityException();
    }

    balls.add(ball);
    return balls.size();
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
