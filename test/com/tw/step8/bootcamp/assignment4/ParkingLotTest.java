package com.tw.step8.bootcamp.assignment4;

import com.tw.step8.bootcamp.assignment4.exception.NoParkingSpaceException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldThrowNoParkingSpaceExceptionWhenParkingOverMaxLotLimit() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager,new ArrayList<>(Arrays.asList(attendant)));

    ParkingLot parkingLot = new ParkingLot(1, 0,notifier);
    Car car = new Car();

    assertThrows(NoParkingSpaceException.class, () -> parkingLot.park(car));
  }

  @Test
  void parkTest() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager,new ArrayList<>(Arrays.asList(attendant)));

    ParkingLot parkingLot = new ParkingLot(1, 1,notifier);
    Car car = new Car();

    int parkingID = parkingLot.park(car);
    assertEquals(1, parkingID);
  }

  @Test
  void isLotFullTest() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager,new ArrayList<>(Arrays.asList(attendant)));
    ParkingLot parkingLot = new ParkingLot(1, 1,notifier);
    Car car = new Car();

    parkingLot.park(car);
    assertTrue(parkingLot.isLotFull());
  }
}