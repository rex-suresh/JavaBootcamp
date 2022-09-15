package com.tw.step8.bootcamp.assignment2;

import com.tw.step8.bootcamp.assignment2.exception.InvalidProbabilityException;

import java.util.Objects;

public class Chance {
  private final static double IMPOSSIBILITY = 0;
  private final static double CERTAINTY = 1;

  private final double value;

  private Chance(double value) {
    this.value = value;
  }

  public static Chance createChance(double value) {
    if (value >= IMPOSSIBILITY && value <= CERTAINTY) {
      return new Chance(value);
    }
    throw new InvalidProbabilityException(value);
  }

  public Chance complement() throws InvalidProbabilityException {
    return createChance(1 - this.value);
  }

  public Chance intersection(Chance chance) throws InvalidProbabilityException {
    double combinedProbability = chance.value * this.value;
    return createChance(combinedProbability);
  }

  public Chance union(Chance chance) throws InvalidProbabilityException {
    double unionProbability = this.value + chance.value - intersection(chance).value;
    return createChance(unionProbability);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Chance chance = (Chance) o;
    return Double.compare(chance.value, value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
