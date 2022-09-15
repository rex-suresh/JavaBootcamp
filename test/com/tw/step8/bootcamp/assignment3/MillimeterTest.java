package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillimeterTest {

  @Test
  void shouldCompareMillimeterWithInch() {
    Millimeter millimeter = new Millimeter(100);
    Inch inch = new Inch(4);
    Millimeter expectedLength = new Millimeter(0);

    assertEquals(expectedLength,millimeter.compare(inch));
  }
}