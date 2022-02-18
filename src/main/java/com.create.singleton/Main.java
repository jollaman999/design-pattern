package com.create.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.INSTANCE;

        Settings settings1 = null;
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings1 = (Settings)  constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);
    }
}
