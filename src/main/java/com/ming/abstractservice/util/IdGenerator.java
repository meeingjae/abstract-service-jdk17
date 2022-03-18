package com.ming.abstractservice.util;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class IdGenerator {

    public static long getNumberId() {

        RandomGenerator generator = RandomGeneratorFactory.getDefault().create();

        return generator.nextLong();
    }
}
