package com.tw.step8.bootcamp.assignment4;

import com.tw.step8.bootcamp.assignment4.exception.NoParkingSpaceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ParkingLotTest {
  @Test
  void shouldThrowNoParkingSpaceExceptionWhenParkingOverMaxLotLimit() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = new ParkingLot(1, 0, notifier);
    Car car = new Car(1);

    assertThrows(NoParkingSpaceException.class, () -> parkingLot.park(car));
  }

  @Test
  void shouldParkAGivenCarTest() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = new ParkingLot(1, 1, notifier);
    Car car = new Car(1);

    int parkingID = parkingLot.park(car);

    assertEquals(1, parkingID);
  }

  @Test
  void isLotFullTest() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = new ParkingLot(1, 1, notifier);
    Car car = new Car(1);

    parkingLot.park(car);

    assertTrue(parkingLot.isLotFull());
  }

  @Test
  void shouldGiveLotPercentageFilled() {
    Notifier notifier = new Notifier();
    ParkingLot parkingLot = new ParkingLot(1, 4, notifier);
    Car car = new Car(1);

    parkingLot.park(car);

    assertEquals(parkingLot.percentFilled(), 25d);
  }

  @Test
  void shouldInvokeNotifierWithParkingLotData() {
    Notifier notifier = mock(Notifier.class);
    ParkingLot parkingLot = new ParkingLot(1, 5, notifier);
    Car car = new Car(1);

    parkingLot.park(car);

    verify(notifier).notifyReceivers(parkingLot);
  }

  @Test
  void shouldUnParkTheGivenCar() {
    Notifier notifier = mock(Notifier.class);
    ParkingLot parkingLot = new ParkingLot(1, 10, notifier);
    Car car1 = new Car(1);
    Car car2 = new Car(2);
    Car car3 = new Car(3);

    parkingLot.park(car1);
    parkingLot.park(car2);
    assertEquals(20d, parkingLot.percentFilled());

    parkingLot.unPark(car1);
    assertEquals(10d, parkingLot.percentFilled());

    assertFalse(parkingLot.unPark(car3));
  }
}