package com.tw.step8.bootcamp.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

  @Test
  void shouldGetTailChanceForOneCoin() {
    assertEquals(0.5, ChanceOfFlip.atLeastOneTail(1));
  }

  @Test
  void getNotATailChance() {
    assertEquals(0.5, ChanceOfFlip.getNotATailChance());
  }

  @Test
  void shouldGetAllTailsChanceForTwoCoins() {
    assertEquals(0.25, ChanceOfFlip.atAllTails(2));
  }

  @Test
  void shouldGetAtLeastOneTailChanceForTwoCoins() {
    assertEquals(0.75, ChanceOfFlip.atLeastOneTail(2));
  }
}