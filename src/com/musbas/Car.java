package com.musbas;

public class Car {


    private int tires;
    private int windows;
    private int doors;

    public Car(int tires, int windows, int doors) {
        this.tires = tires;
        this.windows = windows;
        this.doors = doors;
    }

    public Car() {

    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    }
