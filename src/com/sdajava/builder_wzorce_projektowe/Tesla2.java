package com.sdajava.builder_wzorce_projektowe;

/**
 * Created by user on 2017-03-28.
 */
public class Tesla2 extends Builder {

    @Override
    public void buildEngine() {
        carset.setEngine("Engine2");
    }

    @Override
    public void buildHood() {
        carset.setHood("hood3");

    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("swiecacy");

    }

    @Override
    public void buildWheels() {
        carset.setWheels("duze");

    }

    @Override
    public void buildSeats() {
        carset.setSeats("czarne");

    }
}
