package ru.gazprombank.educate.homework10;

public class Homework {
    /*
    Делится ли число на 11
    - сделать статический публичный метод в `HomeWork` под названием `isCool`
    - метод должен принимать на вход 1 параметр `int n`
    - число всегда положительное
    - вернуть `true` если число делится на 11, или если остаток от деления числа на 11 равен 1

    Пример
    ```
    isCool(22) - вернет true
    isCool(23) - вернет true
    isCool(24) - вернет false
    ```
     */

    public static void main(String[] args) {
        int n = 24;
        System.out.println(isCool(n));

    }

    public static boolean isCool(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
