package com.tw.step8.bootcamp.assignment2;

public class ChanceOfFlip {
//  private static double calculateChance(int totalCoinCount, int leastCoinCount) {
//    double totalOutcomes = Math.pow(2, totalCoinCount);
//
//    double unfavourableOutcomes = Math.pow(2, leastCoinCount);
//    double favourableOutcomes = totalOutcomes - unfavourableOutcomes;
//
//    return favourableOutcomes / totalOutcomes;
//  }

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

  public static double getNotATailChance(int coinCount) {
    return 1 - atLeastOneTail(coinCount);
  }
}
