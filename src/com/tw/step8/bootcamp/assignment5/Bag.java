package com.tw.step8.bootcamp.assignment5;

import com.tw.step8.bootcamp.assignment5.exception.BagReachedMaxCapacityException;

import java.util.HashSet;

public class Bag {
  private static final int maxCapacity = 12;
  private final HashSet<Ball> balls;

  public Bag() {
    balls = new HashSet<>();
  }

  public int add(Ball ball) {
    if (balls.size() >= maxCapacity) {
      throw new BagReachedMaxCapacityException();
    }

    balls.add(ball);
    return balls.size();
  }
}
