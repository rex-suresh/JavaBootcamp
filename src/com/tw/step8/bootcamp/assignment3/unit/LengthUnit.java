package com.tw.step8.bootcamp.assignment3.unit;

import com.tw.step8.bootcamp.assignment3.exception.IncompatibleUnitException;

public enum LengthUnit {
  INCH(1,5/2d),
  FOOT(12, 30),
  CENTIMETER(2/5d, 1),
  MILLIMETER(1/25d, 10),
  TEST_UNIT(0,0);

  private final double toInch;
  private final double toCm;

  LengthUnit(double toInch, double toCm) {
    this.toInch = toInch;
    this.toCm = toCm;
  }

  public double toBase(LengthUnit toUnit) throws IncompatibleUnitException {
    switch (toUnit) {
      case INCH: return toInch;
      case FOOT: return toInch * 12;
      case CENTIMETER: return toCm;
      case MILLIMETER: return toCm * 10;
    }
    // not a toUnit
    throw new IncompatibleUnitException(this, toUnit);
  }
}
