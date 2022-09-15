package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Feet extends Length {
  public Feet(double value) {
    super();
    super.value = value;
  }

  public ComparisonResult compare(Length anotherLength) {
    Feet anotherFeet = anotherLength.toFeet();
    return super.compare(anotherFeet);
//    if (this.equals(anotherFeet)) {
//      return ComparisonResult.EQUAL;
//    }
//    return (super.value - anotherFeet.value) > 0 ? ComparisonResult.LONG: ComparisonResult.SHORT;
  }

  @Override
  public Inch toInch() {
    return null;
  }

  @Override
  public Feet toFeet() {
    return this;
  }

  @Override
  public Centimeter toCentimeter() {
    return null;
  }

  @Override
  public Millimeter toMillimeter() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Feet feet = (Feet) o;
    return Double.compare(feet.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
