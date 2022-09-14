package com.tw.step8.bootcamp.assignment2;

import java.util.Objects;

public class Chance {
  private final double probability;

  public Chance(double probability) {
    this.probability = probability;
  }

  public Chance complement() {
    return new Chance(1 - probability);
  }

  //  As a math student, I want to represent a chance of  getting tails when flipping two coins
//  As a math student, I want to represent a chance of  getting at least one tails when flipping two coins

  public Chance andOf(Chance chance) {
    double combinedProbability = chance.probability * probability;
    return new Chance(combinedProbability);
  }

  public Chance OrOf(Chance chance) {
    double combinedProbability = probability + (chance.probability * probability);
    return new Chance(combinedProbability);
  }

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
