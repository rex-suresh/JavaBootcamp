package com.tw.step8.bootcamp.assignment3;

import com.tw.step8.bootcamp.assignment3.exception.IncompatibleUnitException;
import static com.tw.step8.bootcamp.assignment3.unit.LengthUnit.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

  @Test
  void shouldCompareInchToAnotherInch() throws IncompatibleUnitException {
    Length inch1 = new Length(10, INCH);
    Length inch2 = new Length(8, INCH);

    assertEquals(ComparisonResult.GREATER, inch1.compare(inch2));
  }

  @Test
  void shouldCompareInchToCentimeter() throws IncompatibleUnitException {
    Length inch = new Length(2, INCH);
    Length centimeter = new Length(5, CENTIMETER);

    assertEquals(ComparisonResult.EQUAL, inch.compare(centimeter));
  }

  @Test
  void shouldAddAInchToAnotherInch() throws IncompatibleUnitException {
    Length inch1 = new Length(2, INCH);
    Length inch2 = new Length(2, INCH);

    Length result = new Length(4, INCH);

    assertEquals(result,inch1.add(inch2));
  }

  @Test
  void shouldAddACentimeterToInch() throws IncompatibleUnitException {
    Length inch = new Length(2, INCH);
    Length centimeter = new Length(2.5, CENTIMETER);

    Length result = new Length(3, INCH);

    assertEquals(result,inch.add(centimeter));
  }

  @Test
  void shouldCompareFootToInches() throws IncompatibleUnitException {
    Length foot = new Length(1, FOOT);
    Length inch = new Length(12, INCH);

    assertEquals(ComparisonResult.EQUAL, foot.compare(inch));
  }

  @Test
  void shouldCompareCentimeterToOtherCentimeter() throws IncompatibleUnitException {
    Length centimeter = new Length(10, CENTIMETER);
    Length anotherCentimeter = new Length(8, CENTIMETER);

    assertEquals(ComparisonResult.GREATER, centimeter.compare(anotherCentimeter));
  }

  @Test
  void shouldCompareCentimeterToMillimeter() throws IncompatibleUnitException {
    Length centimeter = new Length(1, CENTIMETER);
    Length millimeter = new Length(10, MILLIMETER);

    assertEquals(ComparisonResult.EQUAL, centimeter.compare(millimeter));
  }

  @Test
  void shouldCompareMillimeterToInch() throws IncompatibleUnitException {
    Length millimeter = new Length(100, MILLIMETER);
    Length inch = new Length(4, INCH);

    assertEquals(ComparisonResult.EQUAL,millimeter.compare(inch));
  }
}