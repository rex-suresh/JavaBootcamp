package com.tw.step8.assignment1;

public class Rectangle {
  protected final double length;
  protected final double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double area() {
    return length * width;
  }

  public double perimeter() {
    return 2 * (length + width);
  }
}
