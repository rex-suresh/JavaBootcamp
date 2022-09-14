package com.tw.step8.assignment1;

public class Rectangle {
  private final double length;
  private final double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double area () {
    return length * width;
  }
}
