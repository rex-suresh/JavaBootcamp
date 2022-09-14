package com.tw.step8.bootcamp.assignment1;

import com.tw.step8.bootcamp.assignment1.exception.NegativeArgumentException;

public class Rectangle {
  private final double length;
  private final double width;

  private Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public static Rectangle createRectangle(double length, double width) throws NegativeArgumentException {
    if (length < 0 || width < 0) {
      throw new NegativeArgumentException();
    }
    return new Rectangle(length, width);
  }

  public static Rectangle createSquare(double side) {
    return new Rectangle(side, side);
  }

  public double area() {
    return length * width;
  }

  public double perimeter() {
    return 2 * (length + width);
  }
}
