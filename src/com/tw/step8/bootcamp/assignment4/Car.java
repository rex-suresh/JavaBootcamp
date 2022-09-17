package com.tw.step8.bootcamp.assignment4;

import java.util.Objects;

public class Car {
  private int id;

  public Car(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return id == car.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
