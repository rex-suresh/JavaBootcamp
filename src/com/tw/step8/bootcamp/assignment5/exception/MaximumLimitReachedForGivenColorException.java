package com.tw.step8.bootcamp.assignment5.exception;

import com.tw.step8.bootcamp.assignment5.Color;

public class MaximumLimitReachedForGivenColorException extends RuntimeException {
  public MaximumLimitReachedForGivenColorException(Color color) {
    super(String.format("Maximum limit of %s color balls reached", color));
  }
}
