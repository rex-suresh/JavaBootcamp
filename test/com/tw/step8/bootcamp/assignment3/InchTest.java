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

  @Test
  void shouldAddACentimeterToInch() {
    Inch inch = new Inch(2);
    Centimeter centimeter = new Centimeter(2.5);
    Inch result = new Inch(3);

    assertEquals(result,inch.add(centimeter));
  }

}