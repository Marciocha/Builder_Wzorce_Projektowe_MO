package com.sdajava.builder_wzorce_projektowe;

/**
 * Created by user on 2017-03-28.
 */
public class Tesla extends Builder {

    @Override
    public void buildEngine() {
        carset.setEngine("Engine1");

    }

    @Override
    public void buildHood() {
        carset.setHood("hood2");

    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("ladny");

    }

    @Override
    public void buildWheels() {
        carset.setWheels("ladne");

    }

    @Override
    public void buildSeats() {
        carset.setSeats("comfortable");

    }
}
