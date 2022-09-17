package com.tw.step8.bootcamp.assignment4;

import com.tw.step8.bootcamp.assignment4.exception.NoParkingSpaceException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ParkingLotTest {
  @Test
  void shouldThrowNoParkingSpaceExceptionWhenParkingOverMaxLotLimit() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager, new ArrayList<>(Arrays.asList(attendant)));
    ParkingLot parkingLot = new ParkingLot(1, 0, notifier);

    Car car = new Car(1);

    assertThrows(NoParkingSpaceException.class, () -> parkingLot.park(car));
  }

  @Test
  void parkTest() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager, new ArrayList<>(Arrays.asList(attendant)));
    ParkingLot parkingLot = new ParkingLot(1, 1, notifier);
    Car car = new Car(1);

    int parkingID = parkingLot.park(car);

    assertEquals(1, parkingID);
  }

  @Test
  void isLotFullTest() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager, new ArrayList<>(Arrays.asList(attendant)));
    ParkingLot parkingLot = new ParkingLot(1, 1, notifier);
    Car car = new Car(1);

    parkingLot.park(car);

    assertTrue(parkingLot.isLotFull());
  }

  @Test
  void percentFilled() {
    Manager manager = new Manager();
    Attendant attendant = new Attendant();
    Notifier notifier = new Notifier(manager, new ArrayList<>(Arrays.asList(attendant)));
    ParkingLot parkingLot = new ParkingLot(1, 4, notifier);
    Car car = new Car(1);

    parkingLot.park(car);

    assertEquals(parkingLot.percentFilled(), 25d);
  }

  @Test
  void shouldInvokeNotifierWithParkingLotData() {
    Notifier notifier = mock(Notifier.class);
    ParkingLot parkingLot = new ParkingLot(1, 4, notifier);
    Car car = new Car(1);

    parkingLot.park(car);

    verify(notifier).notifyReceivers(parkingLot);
  }
}