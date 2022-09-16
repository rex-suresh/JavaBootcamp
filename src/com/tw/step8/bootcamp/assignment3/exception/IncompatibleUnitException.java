package com.tw.step8.bootcamp.assignment3.exception;

import com.tw.step8.bootcamp.assignment3.unit.LengthUnit;

public class IncompatibleUnitException extends Exception {
  private final LengthUnit fromUnit;
  private final LengthUnit toUnit;

  public IncompatibleUnitException(LengthUnit fromUnit, LengthUnit toUnit) {
    super();
    this.fromUnit = fromUnit;
    this.toUnit = toUnit;
  }

  @Override
  public String getMessage() {
    return String.format("Incompatible unit : %s to %s", fromUnit, toUnit);
  }
}
