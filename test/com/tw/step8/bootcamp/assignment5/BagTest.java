package com.tw.step8.bootcamp.assignment5;

import com.tw.step8.bootcamp.assignment5.exception.BagReachedMaxCapacityException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  @Test
  void shouldAddBallToTheBag() {
    Bag bag = new Bag();
    Ball ball = new Ball();

    assertEquals(1,bag.add(ball));
  }

  @Test
  void shouldNotAddMoreThan12Balls() {
    Bag bag = new Bag();
    Ball ball1 = new Ball();
    Ball ball2 = new Ball();
    Ball ball3 = new Ball();
    Ball ball4 = new Ball();
    Ball ball5 = new Ball();
    Ball ball6 = new Ball();
    Ball ball7 = new Ball();
    Ball ball8 = new Ball();
    Ball ball9 = new Ball();
    Ball ball10 = new Ball();
    Ball ball11 = new Ball();
    Ball ball12 = new Ball();
    Ball ball13 = new Ball();

    Ball [] balls = new Ball[] {ball1, ball2, ball3, ball4, ball5, ball6, ball7, ball8, ball9, ball10, ball11, ball12};
    for (Ball ball : balls) {
      bag.add(ball);
    }

    assertThrows(BagReachedMaxCapacityException.class, () ->bag.add(ball13));
  }
}