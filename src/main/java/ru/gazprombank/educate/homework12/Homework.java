package ru.gazprombank.educate.homework12;

public class Homework {
    /*
    Сумма уникальных чисел
    - сделать статический публичный метод в `HomeWork` под названием `sumUnique`
    - метод должен принимать на вход 3 параметра `int a, int b, int c`
    - метод должен вернуть сумму чисел
    - если есть одинаковые числа, то они в подсчете суммы не участвуют

    Пример
    ```
    sumUnique(1, 2, 3) - вернет 6
    sumUnique(3, 2, 3) - вернет 2
    sumUnique(3, 3, 3) - вернет 0
    ```
     */

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 3;
        System.out.println(sumUnique(a, b, c));
    }

    public static int sumUnique(int a, int b, int c) {
        if (a == b & a == c) {
            a = 0;
            b = 0;
            c = 0;
        }
        if (a == b) {
            a = 0;
            b = 0;
        }
        if (a == c) {
            a = 0;
            c = 0;
        }
        if (b == c) {
            b = 0;
            c = 0;
        }
        return a + b + c;
    }
}
