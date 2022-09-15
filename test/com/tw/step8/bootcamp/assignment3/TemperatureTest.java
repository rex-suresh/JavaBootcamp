package com.tw.step8.bootcamp.assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
  @Test
  void shouldCompareFtoC() {
    Temperature fahrenheit = new Temperature(212, TemperatureUnit.FAHRENHEIT);
    Temperature celsius = new Temperature(100, TemperatureUnit.CELSIUS);

    assertEquals(ComparisonResult.EQUAL, fahrenheit.compare(celsius));
  }
}