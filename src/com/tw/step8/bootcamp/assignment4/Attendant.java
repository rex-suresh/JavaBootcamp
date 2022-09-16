package com.tw.step8.bootcamp.assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Attendant {
  private final ArrayList<ParkingLot> parkingLots;
  private HashSet<ParkingLot> promotableTable;
  private ParkingLot promotedLot;

  public Attendant() {
    this.promotableTable = new HashSet<>();
    this.parkingLots = new ArrayList<>();
  }

  public void addLot(ParkingLot lot) {
    promotedLot = lot;
    parkingLots.add(lot);
  }

  public void park(Car car) {
    promotedLot.park(car);
  }

  public void getNotified(ParkingLot lot) {
    if (parkingLots.contains(lot)) {
      promotableTable.add(lot);
    }
    System.out.println("Notification in Attendant");
  }
}
