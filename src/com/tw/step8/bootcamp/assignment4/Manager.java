package com.tw.step8.bootcamp.assignment4;

import java.util.HashSet;

public class Manager implements Notifiable{
  private final HashSet<ParkingLot> almostFilled;

  public Manager() {
    this.almostFilled = new HashSet<>();
  }

  @Override
  public void getNotified(ParkingLot lot) {
    almostFilled.add(lot);
  }
}
