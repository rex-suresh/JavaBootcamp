package com.tw.step8.bootcamp.assignment3;

public enum TemperatureUnit {
  FAHRENHEIT {
    @Override
    double toBase(TemperatureUnit toUnit, double value) {
      return toUnit == FAHRENHEIT ? value : (value - 32) * (5/9d);
    }
  },
  CELSIUS {
    @Override
    double toBase(TemperatureUnit toUnit, double value) {
      return toUnit == CELSIUS ? value : (value * 9/5d) + 32;
    }
  };

  abstract double toBase(TemperatureUnit toUnit, double value);
}
