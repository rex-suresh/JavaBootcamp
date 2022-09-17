package com.tw.step8.bootcamp.assignment4;

import java.util.HashSet;

public class Manager {
  private final HashSet<ParkingLot> almostFilled;

  public Manager() {
    this.almostFilled = new HashSet<>();
  }

  public void getNotified(ParkingLot lot) {
    almostFilled.add(lot);
  }
}
