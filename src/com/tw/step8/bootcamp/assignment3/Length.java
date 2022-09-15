package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit type;

  public Length(double value, LengthUnit type) {
    this.value = value;
    this.type = type;
  }

  public ComparisonResult compare(Length length) {
    double convertedLength = convertTo(length.type);

    if (convertedLength == length.value) {
      return ComparisonResult.EQUAL;
    }
    return convertedLength > length.value ? ComparisonResult.GREATER : ComparisonResult.LESSER;
  }

  private double convertTo(LengthUnit toUnit) {
    return this.value * type.to(toUnit);
  }

  public Length add (Length otherLength) {
    double unitsInInch = otherLength.convertTo(LengthUnit.INCH) + this.convertTo(LengthUnit.INCH);
    return new Length(unitsInInch, LengthUnit.INCH);
  }

  private static boolean WithinRange(Length length1, Length length2,double delta) {
    double difference = Math.abs(length1.value - length2.value);
    return difference < delta;
  }

  // for equating doubles
  public boolean equivalent(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return WithinRange(this,length, 0.01)&& type == length.type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(length.value, value) == 0 && type == length.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }
}
