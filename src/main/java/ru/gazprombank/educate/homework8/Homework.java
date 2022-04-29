package ru.gazprombank.educate.homework8;

public class Homework {
    /*
    Поют ли птицы

    сделать статический публичный метод в HomeWork под названием birdsSinging
    метод должен принимать на вход 2 параметра int temp, boolean isSummer
    птицы поют если температура temp находится в диапазоне от 60 до 90 включительно
    если на дворе лето isSummer = true, то тогда верхний предел температуры temp повышается до 100 вместо 90
    Пример

    birdsSinging(70, false) - вернет true
    birdsSinging(95, false)- вернет false
    birdsSinging(95, true) - вернет true
     */

    public static void main(String[] args) {
        int temp = 78;
        boolean isSummer = true;
        System.out.println(birdsSinging(temp, isSummer));
    }

    public static boolean birdsSinging(int temp, boolean isSummer) {
        int upperTemperature = 0;
        if (isSummer == true) upperTemperature = 10;
        // птицы поют если температура temp находится в диапазоне от 60 до 90 включительно
        // если на дворе лето isSummer = true, то тогда верхний предел температуры temp повышается до 100 вместо 90
        if (temp >= 60 && temp <= 90 + upperTemperature) return true;

        return false;
    }

}