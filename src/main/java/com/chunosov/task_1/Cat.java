package com.chunosov.task_1;

public class Cat extends Animal {

    private static int countCats = 0;
    private static double amountOfFood = 0;
    private final double maximumDistance = 200;
    private String name;
    private boolean satiety;


    public Cat(String name) {
        this.name = name;
        countCats++;
        satiety = false;
    }

    @Override
    public void run(double lengthOfObstacles) {
        if (lengthOfObstacles > maximumDistance) {
            System.out.println("Кот не может пробежать больше чем " + maximumDistance + " метров");
            return;
        }
        System.out.println(name + " пробежал " + lengthOfObstacles + " метров");
    }

    @Override
    public void swim(double lengthOfObstacles) {
        System.out.println("Коты не умеют плавать");
    }

    public void eat(double food) {
        if (Cat.amountOfFood == 0) {
            System.out.println("Миска пустая. " + name + " остался голодным(((");
            return;
        }

        if (food > Cat.amountOfFood) {
            satiety = false;
            System.out.println("В миске количество еды равно "
                    + Cat.amountOfFood + ". " + name + " не трогал еду и остался ГОЛОДНЫМ(((");
            return;
        }

        satiety = true;
        System.out.println(name + " съел из миски количество еды равное " + food +
                " стал СЫТЫМ и в миске осталось еды равное " + (Cat.amountOfFood - food));
        Cat.amountOfFood = Cat.amountOfFood - food;

    }

    public static void addFood(double food) {
        Cat.amountOfFood = Cat.amountOfFood + food;
        System.out.println("В миску добавили количество еды равное " + food + ". В миске стало "  + Cat.amountOfFood);
    }

    public static int getCountCats() {
        return countCats;
    }

    public static double getAmountOfFood() {
        return amountOfFood;
    }

    public static void setAmountOfFood(double amountOfFood) {
        Cat.amountOfFood = amountOfFood;
    }

}
