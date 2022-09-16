package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

  @Test
  void shouldCompareAnInchWithAnotherInch() {
    Length inch1 = new Length(10, LengthUnit.INCH);
    Length inch2 = new Length(8, LengthUnit.INCH);

    assertEquals(ComparisonResult.GREATER, inch1.compare(inch2));
  }

  @Test
  void shouldCompareAnInchWithCentimeter() {
    Length inch = new Length(2, LengthUnit.INCH);
    Length centimeter = new Length(5, LengthUnit.CENTIMETER);

    assertEquals(ComparisonResult.EQUAL, inch.compare(centimeter));
  }

  @Test
  void shouldAddAInchToAnotherInch() {
    Length inch1 = new Length(2, LengthUnit.INCH);
    Length inch2 = new Length(2, LengthUnit.INCH);

    Length result = new Length(4, LengthUnit.INCH);

    assertEquals(result,inch1.add(inch2));
  }

  @Test
  void shouldAddACentimeterToInch() {
    Length inch = new Length(2, LengthUnit.INCH);
    Length centimeter = new Length(2.5, LengthUnit.CENTIMETER);

    Length result = new Length(3, LengthUnit.INCH);

    assertEquals(result,inch.add(centimeter));
  }

  @Test
  void shouldCompareFeetWithInches() {
    Length feet = new Length(1, LengthUnit.FEET);
    Length inch = new Length(12, LengthUnit.INCH);

    assertEquals(ComparisonResult.EQUAL, feet.compare(inch));
  }

  @Test
  void shouldCompareCentimeterWithOtherCentimeter() {
    Length centimeter = new Length(10, LengthUnit.CENTIMETER);
    Length anotherCentimeter = new Length(8, LengthUnit.CENTIMETER);

    assertEquals(ComparisonResult.GREATER, centimeter.compare(anotherCentimeter));
  }

  @Test
  void shouldCompareCentimeterWithMillimeter() {
    Length centimeter = new Length(1, LengthUnit.CENTIMETER);
    Length millimeter = new Length(10, LengthUnit.MILLIMETER);

    assertEquals(ComparisonResult.EQUAL, centimeter.compare(millimeter));
  }

  @Test
  void shouldCompareMillimeterWithInch() {
    Length millimeter = new Length(100, LengthUnit.MILLIMETER);
    Length inch = new Length(4, LengthUnit.INCH);

    assertEquals(ComparisonResult.EQUAL,millimeter.compare(inch));
  }
}