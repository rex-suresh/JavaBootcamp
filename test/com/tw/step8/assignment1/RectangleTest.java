package com.tw.step8.assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

@Test
  void area() {
    Rectangle rectangle = new Rectangle(10, 10);
    assertEquals(100, rectangle.area());
  }
}