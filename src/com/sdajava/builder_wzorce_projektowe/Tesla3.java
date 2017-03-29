package com.sdajava.builder_wzorce_projektowe;

/**
 * Created by user on 2017-03-28.
 */
public class Tesla3 extends Builder {

    @Override
    public void buildEngine() {
        carset.setEngine("Engine3");
    }

    @Override
    public void buildHood() {
        carset.setHood("hood4");

    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("matowy");

    }

    @Override
    public void buildWheels() {
        carset.setWheels("male");

    }

    @Override
    public void buildSeats() {
        carset.setSeats("skorzane");

    }
}
