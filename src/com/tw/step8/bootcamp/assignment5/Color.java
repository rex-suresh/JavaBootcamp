package com.tw.step8.bootcamp.assignment5;

public enum Color {
  GREEN(3), COLOR_LESS(12), RED(6), YELLOW(4), BLUE(12), BLACK(12);

  public final int maxLimit;

  Color(int maxLimit) {
    this.maxLimit = maxLimit;
  }
}
