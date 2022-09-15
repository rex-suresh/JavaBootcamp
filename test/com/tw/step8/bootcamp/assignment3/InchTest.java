package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {

  @Test
  void shouldCompareAnInchWithAnotherInch() {
    Inch inch = new Inch(10);
    Inch anotherInch = new Inch(8);

    assertEquals(ComparisonResult.GREATER, inch.compare(anotherInch));
  }

  @Test
  void shouldCompareAnInchWithCentimeter() {
    Inch inch = new Inch(2);
    Centimeter centimeter = new Centimeter(5);

    assertEquals(ComparisonResult.EQUAL, inch.compare(centimeter));
  }

  @Test
  void shouldAddAInchToAnotherInch() {
    Inch inch1 = new Inch(2);
    Inch inch2 = new Inch(2);
    Inch result = new Inch(4);

    assertEquals(result,inch1.add(inch2));
  }

}