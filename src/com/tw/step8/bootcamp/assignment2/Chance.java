package com.tw.step8.bootcamp.assignment2;

import java.util.Objects;

public class Chance {
  public final double probability;

  public Chance(double probability) {
    this.probability = probability;
  }

  public Chance notAChance() {
    return new Chance(1 - probability);
  }

  //  As a math student, I want to represent a chance of  getting tails when flipping two coins

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Chance chance = (Chance) o;
    return Double.compare(chance.probability, probability) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(probability);
  }
}
