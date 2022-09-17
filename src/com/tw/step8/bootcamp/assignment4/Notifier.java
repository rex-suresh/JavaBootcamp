package com.tw.step8.bootcamp.assignment4;

import java.util.HashSet;

public class Notifier {
  private final HashSet<Notifiable> notifiablesAt80;
  private final HashSet<Notifiable> notifiablesAt20;

  public Notifier() {
    this.notifiablesAt80 = new HashSet<>();
    this.notifiablesAt20 = new HashSet<>();
  }

  public void addNotifiableAt80 (Notifiable notifiable) {
    notifiablesAt80.add(notifiable);
  }

  public void addNotifiableAt20 (Notifiable notifiable) {
    notifiablesAt20.add(notifiable);
  }

  public void notifyReceivers(ParkingLot lot) {
    double percentageFilled = lot.percentFilled();

    if (percentageFilled >= 80.0) {
      notifyAll(notifiablesAt80, lot);
    }

    if (percentageFilled <= 20.0) {
      notifyAll(notifiablesAt20, lot);
    }
  }

  private void notifyAll(HashSet<Notifiable> notifiables, ParkingLot lot) {
    for (Notifiable notifiable : notifiables) {
      notifiable.getNotified(lot);
    }
  }
}
