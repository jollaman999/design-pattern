package com.create.singleton.factorymethod;

public class BlackshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
