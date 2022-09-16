package com.tw.step8.bootcamp.assignment3.unit;

public enum VolumeUnit {
  GALLON(1,3.78d),
  LITRE(1 / 3.78d,1);

  public final double toGallon;
  public final double toLitre;

  VolumeUnit(double toGallon, double toLitre) {
    this.toGallon = toGallon;
    this.toLitre = toLitre;
  }

  public double toBase(VolumeUnit volume) {
    return volume == LITRE ? toLitre : toGallon;
  }
}
