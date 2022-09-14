package com.tw.step8.bootcamp.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

  @Test
  void getTailChance() {
    assertEquals(0.5, Coin.getTailChance());
  }
}