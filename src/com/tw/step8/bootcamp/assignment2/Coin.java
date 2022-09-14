package com.tw.step8.bootcamp.assignment2;

public class Coin {
  private static final double tailChance = 0.5;

  public static double getTailChance() {
    return tailChance;
  }

  public static double getNotATailChance() {
    return 1 - tailChance;
  }
}
