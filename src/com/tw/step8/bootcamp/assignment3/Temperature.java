package com.tw.step8.bootcamp.assignment3;

import com.tw.step8.bootcamp.assignment3.unit.TemperatureUnit;

import java.util.Objects;

public class Temperature {
  private final double value;
  private final TemperatureUnit type;

  public Temperature(double value, TemperatureUnit type) {
    this.value = value;
    this.type = type;
  }

  public ComparisonResult compare(Temperature temperature) {
    double convertedTemp = convertTo(temperature.type);

    if (convertedTemp == temperature.value) {
      return ComparisonResult.EQUAL;
    }
    return convertedTemp > temperature.value ? ComparisonResult.GREATER : ComparisonResult.LESSER;
  }

  private double convertTo(TemperatureUnit toUnit) {
    return this.type.toBase(toUnit, this.value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Temperature that = (Temperature) o;
    return Double.compare(that.value, value) == 0 && type == that.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }
}
