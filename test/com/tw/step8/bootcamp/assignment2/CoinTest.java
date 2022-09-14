package com.tw.step8.bootcamp.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

  @Test
  void shouldGetTailChanceForOneCoin() {
    assertEquals(0.5, Flip.getTailChance(1));
  }

  @Test
  void getNotATailChance() {
    assertEquals(0.5, Flip.getNotATailChance());
  }

  @Test
  void shouldGetTailChanceForTwoCoins() {
    assertEquals(0.75, Flip.getTailChance(2));
  }
}