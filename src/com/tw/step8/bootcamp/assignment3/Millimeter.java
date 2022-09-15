package com.tw.step8.bootcamp.assignment3;

import javax.swing.event.MouseInputListener;
import java.util.Objects;

public class Millimeter implements Length {
  private double value;

  public Millimeter(double value) {
    this.value = value;
  }

  public Millimeter compare(Length anotherLength) {
    Millimeter millimeter = anotherLength.toMillimeter();
    return new Millimeter(this.value - millimeter.value);
  }

  //  As a math student, I wish to compare lengths in mm and inch\ 100 mm = 4 in
  @Override
  public Inch toInch() {
    double conversionConstant = 1 / 25d;
    return new Inch(value * conversionConstant);
  }

  @Override
  public Feet toFeet() {
    return null;
  }

  @Override
  public Centimeter toCentimeter() {
    double conversionConstant = 1 / 10d;
    return new Centimeter(value * conversionConstant);
  }

  @Override
  public Millimeter toMillimeter() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Millimeter that = (Millimeter) o;
    return Double.compare(that.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
