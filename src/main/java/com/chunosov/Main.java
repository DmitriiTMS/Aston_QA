package com.chunosov;

import com.chunosov.task_1.Animal;
import com.chunosov.task_1.Cat;
import com.chunosov.task_1.Dog;

public class Main {
    public static void main(String[] args) {
//        task_1
        System.out.println("ЗАДАНИЕ №1");
        System.out.println("ИНФОРМАЦИЯ О СОБАКАХ");

        Dog dog1 = new Dog("Бобик");
        dog1.run(200);

        Dog dog2 = new Dog("Рэкс");
        dog2.run(501);

        Dog dog3 = new Dog("Шарик");
        dog3.swim(9);

        Dog dog4 = new Dog("Альфрэд");
        dog4.swim(11);

        System.out.println("Количество созданных собак равно " + Dog.getCountDogs());

        System.out.println("=============================================");

        System.out.println("ИНФОРМАЦИЯ О КОТАХ");
        Cat cat1 = new Cat("Барсик");
        cat1.run(100);

        Cat cat2 = new Cat("Том");
        cat2.run(201);

        Cat cat3 = new Cat("Мурзик");
        cat3.swim(10);

        System.out.println("Количество созданных котов равно " + Cat.getCountCats());

        System.out.println("=============================================\n" +
                "КОЛИЧЕСТВО СОЗДАННЫХ ЖИВОТНЫХ РАВНО " + Animal.getAnimalsCount());

        Cat cat4 = new Cat("Кот-4");
        Cat cat5 = new Cat("Кот-5");
        Cat cat6 = new Cat("Кот-6");

        Cat[] catsArray = {cat4, cat5, cat6};

        Cat.setAmountOfFood(8);
        System.out.println("В миску насыпали количество еды равное " + Cat.getAmountOfFood());
        for (Cat cat : catsArray) {
            cat.eat(3);
        }

        Cat.addFood(1);
        Cat.addFood(1);

        for (Cat cat : catsArray) {
            cat.eat(3);
        }
        System.out.println("#############################################");
//        task_2
        System.out.println("ЗАДАНИЕ №2");

    }
}