package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {

  @Test
  void shouldCompareFeetWithAnotherFeet() {
    Feet feet = new Feet(1);
    Feet anotherFeet = new Feet(3);
    Feet expectedLength = new Feet(-2);

    assertEquals(expectedLength, feet.compare(anotherFeet));
  }
}