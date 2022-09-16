package com.tw.step8.bootcamp.assignment3.unit;

import com.tw.step8.bootcamp.assignment3.exception.IncompatibleUnitException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthUnitTest {

  @Test
  void shouldThrowIncompatibleUnitException() {
    assertThrows(IncompatibleUnitException.class,()-> LengthUnit.INCH.toBase(LengthUnit.TEST_UNIT));
  }

}