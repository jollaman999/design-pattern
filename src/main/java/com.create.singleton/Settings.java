package com.create.singleton;

public class Settings {
    private static Settings instance = new Settings();

    private Settings() {

    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
