package com.tw.step8.bootcamp.assignment4;

import com.tw.step8.bootcamp.assignment4.exception.NoParkingSpaceException;

import java.util.HashSet;

// As a parking lot attendant, I want to park a car
// As a parking lot attendant, I want to know when the lot is full
// As a parking lot attendant, I want to handle more than one parking lot

// As a parking lot attendant, I want an assistant to monitor the same parking lots as me and update a display
// As a parking lot manager, I want to know when (each) the lot is 80% full so that I don’t assign that lot to a trainee
// As a parking lot attendant, I want to know when the lot is 20% or less occupied so that I can promote the lot

public class ParkingLot {
  private HashSet<Car> parkingSpaces;
  public final int lotID;
  private final int parkingLimit;
  private final Notifier notifier;

  public ParkingLot(int lotID, int parkingLimit, Notifier notifier) {
    this.lotID = lotID;
    this.parkingLimit = parkingLimit;
    this.notifier = notifier;
    this.parkingSpaces = new HashSet<>();
  }

  public int park(Car car) {
    if (!this.isLotFull()) {
      parkingSpaces.add(car);
      notifier.notifyReceivers(this);
      return parkingSpaces.size();
    }
    throw new NoParkingSpaceException();
  }

  public int unPark(Car car) {
    return 0;
  }

  public boolean isLotFull() {
    return parkingSpaces.size() >= parkingLimit;
  }

  public double percentFilled() {
    return ( parkingSpaces.size() * 100d ) / parkingLimit;
  }
}
