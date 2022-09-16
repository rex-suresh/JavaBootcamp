package com.tw.step8.bootcamp.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void parkTest() {
    ParkingLot parkingLot = new ParkingLot(1);
    Car car = new Car();

    int parkingID = parkingLot.park(car);
    assertEquals(1, parkingID);
  }

  @Test
  void isLotFullTest() {
    ParkingLot parkingLot = new ParkingLot(1);
    Car car = new Car();

    parkingLot.park(car);
    assertTrue(parkingLot.isLotFull());
  }
}