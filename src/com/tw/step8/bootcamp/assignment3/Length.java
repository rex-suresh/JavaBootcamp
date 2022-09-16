package com.tw.step8.bootcamp.assignment3;

import com.tw.step8.bootcamp.assignment3.exception.IncompatibleUnitException;
import com.tw.step8.bootcamp.assignment3.unit.LengthUnit;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;

  public Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public ComparisonResult compare(Length otherLength) throws IncompatibleUnitException {
    double convertedLength = convertTo(otherLength.unit);

    if (convertedLength == otherLength.value) {
      return ComparisonResult.EQUAL;
    }

    return convertedLength > otherLength.value ? ComparisonResult.GREATER : ComparisonResult.LESSER;
  }

  private double convertTo(LengthUnit toUnit) throws IncompatibleUnitException {
    return this.value * unit.toBase(toUnit);
  }

  public Length add (Length otherLength) throws IncompatibleUnitException {
    double unitsInInch = otherLength.convertTo(LengthUnit.INCH) + this.convertTo(LengthUnit.INCH);
    return new Length(unitsInInch, LengthUnit.INCH);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(length.value, value) == 0 && unit == length.unit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}
