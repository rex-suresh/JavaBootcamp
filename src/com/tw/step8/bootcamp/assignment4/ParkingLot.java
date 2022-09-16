package com.tw.step8.bootcamp.assignment4;

// As a parking lot attendant, I want to park a car
// As a parking lot attendant, I want to know when the lot is full

public class ParkingLot {
  private int parkingSpaceID;
  private final int parkingLimit;

  public ParkingLot(int parkingLimit) {
    this.parkingLimit = parkingLimit;
    this.parkingSpaceID = 0;
  }

  public int park(Car car) {
    parkingSpaceID++;
    return parkingSpaceID;
  }

  public boolean isLotFull() {
    return parkingSpaceID >= parkingLimit;
  }
}
