package com.tw.step8.bootcamp.assignment3;

public class Feet {
  private double value;

  public Feet(double value) {
    this.value = value;
  }

  public Feet compare(Feet anotherLength) {
    return new Feet(this.value - anotherLength.value);
  }
}
