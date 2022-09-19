package com.tw.step8.bootcamp.assignment5.exception;

import com.tw.step8.bootcamp.assignment5.Color;

public class MaximumLimitOfSameColorBallsReachedException extends RuntimeException {
  public MaximumLimitOfSameColorBallsReachedException(Color color) {
    super(String.format("Maximum limit of %s color balls reached", color));
  }
}
