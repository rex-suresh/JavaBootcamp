package com.tw.step8.bootcamp.assignment3;

public abstract class Length {
  protected double value;
  abstract Inch toInch();
  abstract Feet toFeet();
  abstract Centimeter toCentimeter();
  abstract Millimeter toMillimeter();

  public ComparisonResult compare (Length other) {
    if (this.equals(other)) {
      return ComparisonResult.EQUAL;
    }
    return (this.value - other.value) > 0 ? ComparisonResult.GREATER : ComparisonResult.LESSER;
  }
}
