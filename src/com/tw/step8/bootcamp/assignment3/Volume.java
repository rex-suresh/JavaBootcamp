package com.tw.step8.bootcamp.assignment3;

import com.tw.step8.bootcamp.assignment3.unit.VolumeUnit;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnit type;

  public Volume(double value, VolumeUnit type) {
    this.value = value;
    this.type = type;
  }

  public ComparisonResult compare(Volume volume) {
    double convertedVolume = convertTo(volume.type);

    if (convertedVolume == volume.value) {
      return ComparisonResult.EQUAL;
    }
    return convertedVolume > volume.value ? ComparisonResult.GREATER : ComparisonResult.LESSER;
  }

  private double convertTo(VolumeUnit toUnit) {
    return this.value * type.toBase(toUnit);
  }

  public Volume add(Volume otherVolume) {
    double unitsInLitre = otherVolume.convertTo(VolumeUnit.LITRE) + this.convertTo(VolumeUnit.LITRE);
    return new Volume(unitsInLitre, VolumeUnit.LITRE);
  }

  private static boolean withinRange(Volume vol1, Volume vol2, double delta) {
    double difference = Math.abs(vol1.value - vol2.value);
    return difference < delta;
  }

  // for equating doubles
  public boolean equivalent(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Volume volume = (Volume) o;
    return withinRange(this, volume, 0.01) && type == volume.type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Volume volume = (Volume) o;
    return Double.compare(volume.value, value) == 0 && type == volume.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }
}
