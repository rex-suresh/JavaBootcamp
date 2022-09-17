package com.tw.step8.bootcamp.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AttendantTest {

  @Test
  void shouldParkInPromotedParkingLot() {
    Attendant attendant = new Attendant();
    ParkingLot lot = mock(ParkingLot.class);
    Car car = new Car(1);

    attendant.addLot(lot);
    attendant.park(car);

    verify(lot).park(car);
  }
}