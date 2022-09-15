package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Inch {
  private double value;

  public Inch(double value) {
    this.value = value;
  }

  public Inch compare(Inch anotherLength) {
    return new Inch(this.value - anotherLength.value);
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
