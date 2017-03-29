package com.sdajava.builder_wzorce_projektowe;

/**
 * Created by user on 2017-03-28.
 */
abstract class Builder {

    protected Carset carset;//pole protected jest dostepne w klasach tej samej paczki

    public void newCar() {
        carset = new Carset();

    }

    public Carset getCarset() {
        return carset;
    }

    public abstract void buildEngine();

    public abstract void buildHood();

    public abstract void buildLacquer();

    public abstract void buildWheels();

    public abstract void buildSeats();


}
