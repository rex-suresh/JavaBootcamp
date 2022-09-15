package com.tw.step8.bootcamp.assignment3;

public class Millimeter implements Length{
  private double value;

  public Millimeter(double value) {
    this.value = value;
  }

  @Override
  public Inch toInch() {
    return null;
  }

  @Override
  public Feet toFeet() {
    return null;
  }

  @Override
  public Centimeter toCentimeter() {
    double conversionConstant = 1/10d;
    return new Centimeter(value * conversionConstant );
  }
}
