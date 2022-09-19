package com.tw.step8.bootcamp.assignment5;

public enum Color {
  GREEN(3), COLOR_LESS(13), RED(6), YELLOW(4);

  public final int maxLimit;

  Color(int maxLimit) {
    this.maxLimit = maxLimit;
  }
}
