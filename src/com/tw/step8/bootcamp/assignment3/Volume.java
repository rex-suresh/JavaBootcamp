package com.tw.step8.bootcamp.assignment3;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnit type;

  public Volume(double value, VolumeUnit type) {
    this.value = value;
    this.type = type;
  }

  public ComparisonResult compare(Volume volume) {
    double convertedVolume = getConvertedVolume(volume);

    if (convertedVolume == volume.value) {
      return ComparisonResult.EQUAL;
    }
    return convertedVolume > volume.value ? ComparisonResult.GREATER : ComparisonResult.LESSER;
  }

  private double getConvertedVolume(Volume volume) {
    return value * type.to(volume.type);
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
