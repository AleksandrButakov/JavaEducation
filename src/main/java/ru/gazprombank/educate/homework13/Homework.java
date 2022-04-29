package ru.gazprombank.educate.homework13;

public class Homework {
    /*
    Какое число ближе к 21
    - сделать статический публичный метод в `HomeWork` под названием `nearestTwentyOne`
    - метод должен принимать на вход 2 параметра `int a, int b`
    - метод должен вернуть число, которое ближе к 21, но не больше 21
    - если оба числа больше 21, то вернуть 0

    Пример
    ```
    nearestTwentyOne(19, 21) - вернет 21
    nearestTwentyOne(21, 19) - вернет 21
    nearestTwentyOne(19, 22) - вернет 19
    nearestTwentyOne(32, 22) - вернет 0
    ```
     */

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(nearestTwentyOne(a, b));
    }

    public static int nearestTwentyOne(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else {
            if (a > 21) {
                return b;
            } else {
                if (b > 21) {
                    return a;
                } else {
                    if (a > b) {
                        return a;
                    } else {
                        return b;
                    }
                }
            }
        }

    }

}
