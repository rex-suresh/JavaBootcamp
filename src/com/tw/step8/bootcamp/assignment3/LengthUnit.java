package com.tw.step8.bootcamp.assignment3;

public enum LengthUnit {
  INCH(1,5/2d),
  FEET(12, 30),
  CENTIMETER(2/5d, 1),
  MILLIMETER(1/25d, 10);

  private final double toInch;
  private final double toCm;

  LengthUnit(double toInch, double toCm) {
    this.toInch = toInch;
    this.toCm = toCm;
  }

  public double to (LengthUnit unit){
    switch (unit) {
      case INCH: return toInch;
      case FEET: return toInch * 12;
      case CENTIMETER: return toCm;
      case MILLIMETER: return toCm * 10;
    }
    // not a unit
    return 0;
  }
}
