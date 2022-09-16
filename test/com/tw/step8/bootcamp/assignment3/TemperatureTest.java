package com.tw.step8.bootcamp.assignment3;

import com.tw.step8.bootcamp.assignment3.unit.TemperatureUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
  @Test
  void shouldCompareFtoC() {
    Temperature fahrenheit212 = new Temperature(212, TemperatureUnit.FAHRENHEIT);
    Temperature celsius100 = new Temperature(100, TemperatureUnit.CELSIUS);

    assertEquals(ComparisonResult.EQUAL, fahrenheit212.compare(celsius100));
  }

  @Test
  void shouldCompareCtoF() {
    Temperature fahrenheit200 = new Temperature(200, TemperatureUnit.FAHRENHEIT);
    Temperature celsius100 = new Temperature(100, TemperatureUnit.CELSIUS);

    assertEquals(ComparisonResult.GREATER, celsius100.compare(fahrenheit200));
  }
}