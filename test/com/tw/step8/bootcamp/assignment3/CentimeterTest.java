package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {

  @Test
  void shouldCompareCentimeterWithOtherCentimeter() {
    Centimeter centimeter = new Centimeter(10);
    Centimeter anotherCentimeter = new Centimeter(8);
    Centimeter expectedLength = new Centimeter(2);

    assertEquals(expectedLength, centimeter.compare(anotherCentimeter));
  }

  @Test
  void shouldCompareCentimeterWithMillimeter() {
    Centimeter centimeter = new Centimeter(1);
    Millimeter millimeter = new Millimeter(10);
    Centimeter expectedLength = new Centimeter(0);

    assertEquals(expectedLength, centimeter.compare(millimeter));
  }
}