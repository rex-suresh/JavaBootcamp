package com.tw.step8.bootcamp.assignment3.unit;

public enum TemperatureUnit {
  FAHRENHEIT {
    @Override
    public double toBase(TemperatureUnit toUnit, double value) {
      return toUnit == FAHRENHEIT ? value : (value - 32) * (5/9d);
    }
  },
  CELSIUS {
    @Override
    public double toBase(TemperatureUnit toUnit, double value) {
      return toUnit == CELSIUS ? value : (value * 9/5d) + 32;
    }
  };

  public abstract double toBase(TemperatureUnit toUnit, double value);
}
