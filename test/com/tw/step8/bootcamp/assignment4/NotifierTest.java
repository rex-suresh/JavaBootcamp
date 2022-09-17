package com.tw.step8.bootcamp.assignment4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class NotifierTest {

  @Test
  void shouldAddNotifiableAt80() {
    Notifier notifier = new Notifier();
    Attendant mockedAttended = mock(Attendant.class);
    ParkingLot lot = new ParkingLot(1, 1, notifier);
    Car car = new Car(1);

    notifier.addNotifiableAt80(mockedAttended);
    lot.park(car);

    verify(mockedAttended).getNotified(lot);
  }

  @Test
  void addNotifiableAt20() {
    Notifier notifier = new Notifier();
    Attendant mockedAttended = mock(Attendant.class);
    ParkingLot lot = new ParkingLot(1, 10, notifier);
    Car car = new Car(1);

    notifier.addNotifiableAt20(mockedAttended);
    lot.park(car);

    verify(mockedAttended).getNotified(lot);
  }

  @Test
  void notifyReceivers() {
    Notifier notifier = new Notifier();
    Manager mockedManager = mock(Manager.class);
    Attendant mockedAttended = mock(Attendant.class);
    ParkingLot lot = new ParkingLot(1, 5, notifier);
    Car car1 = new Car(1);
    Car car2 = new Car(2);
    Car car3 = new Car(3);
    Car car4 = new Car(4);

    notifier.addNotifiableAt80(mockedManager);
    notifier.addNotifiableAt20(mockedAttended);

    lot.park(car1);
    lot.park(car2);
    lot.park(car3);
    verify(mockedAttended).getNotified(lot);

    lot.park(car4);
    verify(mockedManager).getNotified(lot);
  }
}