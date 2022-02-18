package com.create.singleton.factorymethod;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    void sendEmailTo(String email, Ship ship);

    Ship createShip();

    void validate(String name, String email);

    static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}
