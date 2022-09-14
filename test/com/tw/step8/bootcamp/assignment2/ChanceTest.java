package com.tw.step8.bootcamp.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void shouldReturnChanceRepresentingNotAChance() {
    Chance chance = new Chance(0.2);
    Chance notAChance = new Chance(0.8);

    assertEquals(notAChance, chance.notAChance());
  }
}