package com.tw.step8.bootcamp.assignment5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  @Test
  void shouldAddBallToTheBag() {
    Bag bag = new Bag();
    Ball ball = new Ball();

    assertEquals(1,bag.add(ball));
  }
}