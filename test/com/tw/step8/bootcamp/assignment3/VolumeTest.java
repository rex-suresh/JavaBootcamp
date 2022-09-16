package com.tw.step8.bootcamp.assignment3;

import com.tw.step8.bootcamp.assignment3.unit.VolumeUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
  @Test
  void shouldCompareGallonWithLitre() {
    Volume gallon = new Volume(1, VolumeUnit.GALLON);
    Volume litre = new Volume(4, VolumeUnit.LITRE);

    assertEquals(ComparisonResult.LESSER, gallon.compare(litre));
  }
  @Test
  void shouldEquateGallonWithLitre() {
    Volume gallon = new Volume(1, VolumeUnit.GALLON);
    Volume litre = new Volume(3.78, VolumeUnit.LITRE);

    assertEquals(ComparisonResult.EQUAL, gallon.compare(litre));
  }

  @Test
  void shouldAddLitreVolumeToGallon() {
    Volume gallon = new Volume(1, VolumeUnit.GALLON);
    Volume litre = new Volume(1, VolumeUnit.LITRE);

    Volume resultVolume = new Volume(4.78, VolumeUnit.LITRE);

    assertTrue(resultVolume.equivalent(gallon.add(litre)));

  }
}