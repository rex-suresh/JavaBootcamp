package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Millimeter extends Length {
  public Millimeter(double value) {
    super();
    super.value = value;
  }

  public ComparisonResult compare(Length anotherLength) {
    Millimeter millimeter = anotherLength.toMillimeter();
    return super.compare(millimeter);
  }

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
