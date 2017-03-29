package com.sdajava.builder_wzorce_projektowe;

/**
 * Created by user on 2017-03-28.
 */
public class Director {

    Tesla tesla = new Tesla();

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Carset getCarset() {
        return builder.getCarset();
    }

    public void build() {
        builder.newCar();
        builder.buildEngine();
        builder.buildHood();
        builder.buildLacquer();
        builder.buildSeats();
        builder.buildWheels();
    }
}
