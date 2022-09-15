package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {

  @Test
  void shouldCompareAnInchWithAnotherInch() {
    Inch inch = new Inch(10);
    Inch anotherInch = new Inch(8);
    Inch expectedLength = new Inch(2);

    assertEquals(expectedLength, inch.compare(anotherInch));
  }

  @Test
  void shouldCompareAnInchWithCentimeter() {
    Inch inch = new Inch(2);
    Centimeter centimeter = new Centimeter(5);
    Inch expectedLength = new Inch(0);

    assertEquals(expectedLength, inch.compare(centimeter));
  }

}