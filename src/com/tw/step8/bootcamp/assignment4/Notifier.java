package com.tw.step8.bootcamp.assignment4;

import java.util.ArrayList;

public class Notifier {
  private Manager manager;
  private ArrayList<Attendant> attendants;

  public Notifier(Manager manager, ArrayList<Attendant> attendants) {
    this.manager = manager;
    this.attendants = attendants;
  }

  public void notifyReceivers(ParkingLot lot) {
    double percentageFilled = lot.percentFilled();
    if (percentageFilled >= 80.0) {
      manager.getNotified(lot);
    }

    if (percentageFilled <= 20.0) {
      for (Attendant attendant : attendants) {
        attendant.getNotified(lot);
      }
    }
  }
}
