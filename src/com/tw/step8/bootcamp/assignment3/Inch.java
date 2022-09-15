package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Inch extends Length{
  public Inch(double value) {
    super();
    super.value = value;
  }

  public ComparisonResult compare(Length anotherLength) {
    Inch anotherInch = anotherLength.toInch();
    return super.compare(anotherInch);
  }

  @Override
  public Inch toInch() {
    return this;
  }

  @Override
  public Feet toFeet() {
    return new Feet(value/12);
  }

  @Override
  public Centimeter toCentimeter() {
    double conversionConstant = 5/2.00;
    return new Centimeter(value * conversionConstant);
  }

  @Override
  public Millimeter toMillimeter() {
    double conversionConstant = 25d;
    return new Millimeter(value * conversionConstant);
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
