package com.tw.step8.bootcamp.assignment5.exception;

public class BagReachedMaxCapacityException extends RuntimeException {
  public BagReachedMaxCapacityException() {
    super("Bag is at maximum capacity");
  }
}
