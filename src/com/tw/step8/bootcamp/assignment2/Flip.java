package com.tw.step8.bootcamp.assignment2;

public class Flip {
  private static final double tailChance = 0.5;

  public static double getTailChance(int coinCount) {
    double totalOutcomes = Math.pow(2, coinCount);
    double favourableOutcomes = totalOutcomes - 1;

    return favourableOutcomes / totalOutcomes;
  }

  public static double getNotATailChance() {
    return 1 - tailChance;
  }
}
