package com.chunosov.task_1;

public abstract class Animal {

    private static int animalsCount = 0;

    public Animal() {
        animalsCount++;
    }

    public abstract void run(double lengthOfObstacles);

    public abstract void swim(double lengthOfObstacles);

    public static int getAnimalsCount() {
        return animalsCount;
    }
}
