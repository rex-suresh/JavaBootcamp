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
    Ball[] balls = new Ball[12];

    for (int ballID = 0; ballID < 12; ballID++) {
      balls[ballID] = (new Ball(Color.COLOR_LESS));
    }
    Ball ball13 = new Ball(Color.COLOR_LESS);

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

  @Test
  void shouldAddRedBallsDoubleTheCountOfGreenBallsOnly() {
    Bag bag = new Bag();
    Ball greenBall = new Ball(Color.GREEN);
    Ball redBall1 = new Ball(Color.RED);
    Ball redBall2 = new Ball(Color.RED);
    Ball redBall3 = new Ball(Color.RED);

    bag.add(greenBall);
    bag.add(redBall1);
    bag.add(redBall2);

    assertThrows(MaximumLimitOfSameColorBallsReachedException.class,() -> bag.add(redBall3));
  }
}