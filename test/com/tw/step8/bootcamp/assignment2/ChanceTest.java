package com.tw.step8.bootcamp.assignment2;

import com.tw.step8.bootcamp.assignment2.exception.InvalidProbabilityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void shouldThrowInvalidProbabilityException() {
    assertThrows(InvalidProbabilityException.class, () -> Chance.createChance(-0.4));
    assertThrows(InvalidProbabilityException.class, () -> Chance.createChance(1.2));
  }

  @Test
  void shouldReturnChanceRepresentingComplement() {
    Chance chance = Chance.createChance(0.2);
    Chance notAChance = Chance.createChance(0.8);

    assertEquals(notAChance, chance.complement());
  }

  @Test
  void shouldReturnIntersectionChanceWithAGivenChance() {
    Chance chance = Chance.createChance(0.5);
    Chance anotherChance = Chance.createChance(1.0/6.0);
    Chance expectedChance = Chance.createChance(1/12.0);

    assertEquals(expectedChance, chance.intersection(anotherChance));
  }

  @Test
  void shouldReturnUnionChanceWithAGivenChance() {
    Chance chance = Chance.createChance(1/3.0);
    Chance anotherChance = Chance.createChance(1/7.0);
    Chance expectedChance = Chance.createChance(9/21.0);

    assertEquals(expectedChance, chance.union(anotherChance));
  }
}