package com.tw.step8.assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
  @Test
  void area() {
    Square square = new Square(8);
    assertEquals(64, square.area());
  }

  @Test
  void perimeter() {
    Square square = new Square(5);
    assertEquals(20, square.perimeter());
  }

}