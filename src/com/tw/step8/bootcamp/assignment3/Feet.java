package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Feet implements Length {
  private final double value;

  public Feet(double value) {
    this.value = value;
  }

  public Feet compare(Length anotherLength) {
    Feet anotherFeet = anotherLength.toFeet();
    return new Feet(this.value - anotherFeet.value);
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
