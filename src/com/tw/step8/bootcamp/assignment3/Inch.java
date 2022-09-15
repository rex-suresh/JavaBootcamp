package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Inch implements Length{
  private final double value;

  public Inch(double value) {
    this.value = value;
  }

  public Inch compare(Length anotherLength) {
    Inch anotherInch = anotherLength.toInch();
    return new Inch(this.value - anotherInch.value);
  }

  @Override
  public Inch toInch() {
    return this;
  }

  @Override
  public Feet toFeet() {
    return null;
  }

  @Override
  public Centimeter toCentimeter() {
    double conversionConstant = 5/2.00;
    return new Centimeter(value * conversionConstant);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Inch inch = (Inch) o;
    return Double.compare(inch.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
