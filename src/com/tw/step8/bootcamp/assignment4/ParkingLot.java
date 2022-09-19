package com.tw.step8.bootcamp.assignment4;

import com.tw.step8.bootcamp.assignment4.exception.NoParkingSpaceException;

import java.util.HashSet;

// As a parking lot attendant, I want to park a car
// As a parking lot attendant, I want to know when the lot is full
// As a parking lot attendant, I want to handle more than one parking lot

// As a parking lot attendant, I want an assistant to monitor the same parking lots as me and update a display
// As a parking lot manager, I want to know when (each) the lot is 80% full so that I don’t assign that lot to a trainee
// As a parking lot attendant, I want to know when the lot is 20% or less occupied so that I can promote the lot
// As a civic body, I want to know when the parking lots are 80% full so I can collect more taxes

public class ParkingLot {
  private final HashSet<Car> parkingSpaces;
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
      this.notifyReceivers();
      return parkingSpaces.size();
    }
    throw new NoParkingSpaceException();
  }

  private void notifyReceivers() {
    notifier.notifyReceivers(this);
  }

  public boolean unPark(Car car) {
    boolean unParkStatus = parkingSpaces.removeIf((parkedCar) -> parkedCar.equals(car));
    this.notifyReceivers();
    return unParkStatus;
  }

  public boolean isLotFull() {
    return parkingSpaces.size() >= parkingLimit;
  }

  public double percentFilled() {
    return ( parkingSpaces.size() * 100d ) / parkingLimit;
  }
}
