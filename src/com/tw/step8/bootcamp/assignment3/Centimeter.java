package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Centimeter implements Length {
  private final double value;

  public Centimeter(double value) {
    this.value = value;
  }

  public Centimeter compare(Length anotherLength) {
    Centimeter anotherCentimeter = anotherLength.toCentimeter();
    return new Centimeter(this.value - anotherCentimeter.value);
  }

  @Override
  public Inch toInch() {
    double conversionConstant = 2/5d;
    return new Inch(value * conversionConstant);
  }

  @Override
  public Feet toFeet() {
    double conversionConstant = 30.48;
    return new Feet(value / conversionConstant);
  }

  @Override
  public Centimeter toCentimeter() {
    return this;
  }

  @Override
  public Millimeter toMillimeter() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Centimeter that = (Centimeter) o;
    return Double.compare(that.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
