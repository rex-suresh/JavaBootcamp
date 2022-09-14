package com.tw.step8.bootcamp.assignment1;

import static org.junit.jupiter.api.Assertions.*;

import com.tw.step8.bootcamp.assignment1.exception.NegativeArgumentException;
import org.junit.jupiter.api.Test;

class RectangleTest {

  @Test
  void shouldProvideArea() throws NegativeArgumentException {
    Rectangle rectangle = Rectangle.createRectangle(10, 10);
    assertEquals(100, rectangle.area());
  }

  @Test
  void shouldProvidePerimeter() throws NegativeArgumentException {
    Rectangle rectangle = Rectangle.createRectangle(10, 8);
    assertEquals(36, rectangle.perimeter());
  }

  @Test
  void shouldCreateRectangle() throws NegativeArgumentException {
    Rectangle rectangle = Rectangle.createRectangle(10, 8);
    assertTrue(rectangle instanceof Rectangle);
  }

  @Test
  void shouldThrowNegativeArgumentException(){
    assertThrows(NegativeArgumentException.class,
      () -> Rectangle.createRectangle(10, -8));
  }

  @Test
  void shouldCreateSquare() {
    Rectangle square = Rectangle.createSquare(10);
    assertTrue(square instanceof Rectangle);
  }

}