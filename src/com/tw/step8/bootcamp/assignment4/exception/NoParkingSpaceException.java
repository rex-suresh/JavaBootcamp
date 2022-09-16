package com.tw.step8.bootcamp.assignment4.exception;

public class NoParkingSpaceException extends RuntimeException {
  public NoParkingSpaceException() {
    super("No parking space available");
  }
}
