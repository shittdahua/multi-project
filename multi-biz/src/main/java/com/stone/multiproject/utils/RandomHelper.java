package com.stone.multiproject.utils;

import lombok.experimental.UtilityClass;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class RandomHelper {

    public ThreadLocalRandom random = ThreadLocalRandom.current();
}
