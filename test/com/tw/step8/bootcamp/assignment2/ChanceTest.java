package com.tw.step8.bootcamp.assignment2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void shouldReturnChanceRepresentingNotAChance() {
    Chance chance = new Chance(0.2);
    Chance notAChance = new Chance(0.8);

    assertEquals(notAChance, chance.complement());
  }

  @Test
  void shouldCombineChanceWithAGivenChance() {
    Chance chance = new Chance(0.5);
    Chance anotherChance = new Chance(0.5);
    Chance expectedChance = new Chance(0.25);

    assertEquals(expectedChance, chance.andOf(anotherChance));
  }

  @Test
  void shouldAddChanceWithAGivenChance() {
    Chance chance = new Chance(0.5);
    Chance anotherChance = new Chance(0.5);
    Chance expectedChance = new Chance(0.75);

    assertEquals(expectedChance, chance.OrOf(anotherChance));
  }
}