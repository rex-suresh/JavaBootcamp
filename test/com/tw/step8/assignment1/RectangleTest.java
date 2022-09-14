package com.tw.step8.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

  @Test
  void area() {
    Rectangle rectangle = new Rectangle(10, 10);
    assertEquals(100, rectangle.area());
  }

  @Test
  void perimeter() {
    Rectangle rectangle = new Rectangle(10, 8);
    assertEquals(36, rectangle.perimeter());
  }

  @Test
  void areaOfDoubles() {
    Rectangle rectangle = new Rectangle(2.4, 2.4);
    assertEquals(5.76, rectangle.area(), 0.1);
  }
}