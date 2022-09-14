package com.tw.step8.bootcamp.assignment2;

public class ChanceOfFlip {
  private static final double tailChance = 0.5;

  public static double atLeastOneTail(int coinCount) {
    double totalOutcomes = Math.pow(2, coinCount);
    double favourableOutcomes = totalOutcomes - 1;

    return favourableOutcomes / totalOutcomes;
  }

  public static double atAllTails(int coinCount) {
    double totalOutcomes = Math.pow(2, coinCount);
    double favourableOutcomes = 1;

    return favourableOutcomes / totalOutcomes;
  }

  public static double getNotATailChance() {
    return 1 - tailChance;
  }
}
