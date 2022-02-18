package com.create.singleton.factorymethod;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
