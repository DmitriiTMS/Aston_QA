package com.chunosov.task_1;

public class Dog extends Animal {

    private static int countDogs = 0;
    private final double maximumDistanceRun = 500;
    private final double maximumDistanceSwim = 10;
    private String name;

    public Dog(String name) {
        this.name = name;
        countDogs++;
    }

    @Override
    public void run(double lengthOfObstacles) {
        if(lengthOfObstacles > maximumDistanceRun ) {
            System.out.println("Собака не может пробежать больше чем " + maximumDistanceRun + " метров");
            return;
        }
        System.out.println(name + " пробежал " + lengthOfObstacles + " метров");
    }

    @Override
    public void swim(double lengthOfObstacles) {
        if(lengthOfObstacles > maximumDistanceSwim ) {
            System.out.println("Собака не может проплыть больше чем " + maximumDistanceSwim + " метров");
            return;
        }
        System.out.println(name + " проплыл " + lengthOfObstacles + " метров");
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
