package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {

  @Test
  void shouldCompareAnInchWithAnotherInch() {
    Inch inch = new Inch(10);
    Inch anotherInch = new Inch(8);

    assertEquals(ComparisonResult.LONG, inch.compare(anotherInch));
  }

  @Test
  void shouldCompareAnInchWithCentimeter() {
    Inch inch = new Inch(2);
    Centimeter centimeter = new Centimeter(5);

    assertEquals(ComparisonResult.EQUAL, inch.compare(centimeter));
  }

}