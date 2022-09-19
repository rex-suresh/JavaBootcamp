package com.tw.step8.bootcamp.assignment5;

import com.tw.step8.bootcamp.assignment5.exception.BagReachedMaxCapacityException;
import com.tw.step8.bootcamp.assignment5.exception.MaximumLimitOfSameColorBallsReachedException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
  @Test
  void shouldAddBallToTheBag() {
    Bag bag = new Bag();
    Ball ball = new Ball(Color.GREEN);

    assertEquals(1, bag.add(ball));
  }

  @Test
  void shouldNotAddMoreThan12Balls() {
    Bag bag = new Bag();
    Ball ball1 = new Ball(Color.COLOR_LESS);
    Ball ball2 = new Ball(Color.COLOR_LESS);
    Ball ball3 = new Ball(Color.COLOR_LESS);
    Ball ball4 = new Ball(Color.COLOR_LESS);
    Ball ball5 = new Ball(Color.COLOR_LESS);
    Ball ball6 = new Ball(Color.COLOR_LESS);
    Ball ball7 = new Ball(Color.COLOR_LESS);
    Ball ball8 = new Ball(Color.COLOR_LESS);
    Ball ball9 = new Ball(Color.COLOR_LESS);
    Ball ball10 = new Ball(Color.COLOR_LESS);
    Ball ball11 = new Ball(Color.COLOR_LESS);
    Ball ball12 = new Ball(Color.COLOR_LESS);
    Ball ball13 = new Ball(Color.COLOR_LESS);

    Ball[] balls = new Ball[] { ball1, ball2, ball3, ball4, ball5, ball6, ball7, ball8, ball9, ball10, ball11, ball12 };
    for (Ball ball : balls) {
      bag.add(ball);
    }

    assertThrows(BagReachedMaxCapacityException.class, () -> bag.add(ball13));
  }

  @Test
  void shouldAllowOnlyThreeGreenBallsToBeAdded() {
    Bag bag = new Bag();
    Ball ball1 = new Ball(Color.GREEN);
    Ball ball2 = new Ball(Color.GREEN);
    Ball ball3 = new Ball(Color.GREEN);
    Ball rejectedBall = new Ball(Color.GREEN);

    bag.add(ball1);
    bag.add(ball2);
    bag.add(ball3);

    assertThrows(MaximumLimitOfSameColorBallsReachedException.class, () -> bag.add(rejectedBall));
  }
}