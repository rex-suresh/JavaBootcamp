package com.tw.step8.bootcamp.assignment5.exception;

import com.tw.step8.bootcamp.assignment5.Color;

public class CannotContainBothBlueAndBlackBallsException extends RuntimeException {
  public CannotContainBothBlueAndBlackBallsException(Color ballColor) {
    super(String.format("Cannot add %s to bag", ballColor));
  }
}
