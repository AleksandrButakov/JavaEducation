package ru.gazprombank.educate.homework7;

public class Homework {
    /*
    Равенство суммы двух чисел третьему

    сделать статический публичный метод в HomeWork под названием twoSumOne
    метод должен принимать на вход 3 параметра int a, int b, int c
    метод должен определить можно ли сложив 2 любых числа, получить третье
    решение должно быть выполнено в 1 строку
    Пример

    twoSumOne(1, 2, 3) - вернет true
    twoSumOne(3, 1, 2) - вернет true
    twoSumOne(3, 2, 2) - вернет false
     */

    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c=12;
        System.out.println(twoSumOne(a,b,c));
    }

    public static boolean twoSumOne(int a, int b, int c) {
        if (a+b==c || b+c==a || a+c==b) return true;
        return false;
    }

}