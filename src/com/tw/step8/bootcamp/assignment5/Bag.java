package com.tw.step8.bootcamp.assignment5;

import com.tw.step8.bootcamp.assignment5.exception.BagReachedMaxCapacityException;
import com.tw.step8.bootcamp.assignment5.exception.MaximumLimitOfSameColorBallsReachedException;

import java.util.HashSet;

public class Bag {
  private static final int maxCapacity = 12;
  private final HashSet<Ball> balls;

  public Bag() {
    balls = new HashSet<>();
  }

  public int add(Ball ball) {
    int sameColoredBallCount = this.sameColoredBallCount(ball.color);

    if (sameColoredBallCount >= 3) {
      throw new MaximumLimitOfSameColorBallsReachedException(ball.color);
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
      if (ball.color == color && color == Color.GREEN) {
        sameColorBalls++;
      }
    }

    return sameColorBalls;
  }
}
