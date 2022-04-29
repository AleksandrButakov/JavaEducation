package ru.gazprombank.educate.homework14;

public class Homework {
    /*
    Сумма чисел где нет 13
    - сделать статический публичный метод в `HomeWork` под названием `partialSum`
    - метод должен принимать на вход 3 параметра `int a, int b, int c`
    - метод должен вернуть сумму чисел
    - но если есть число 13, то это число и следующие за ним числа в подсчете суммы не участвуют

    Пример
    ```
    partialSum(1, 2, 3)  - вернет 6
    partialSum(1, 2, 13) - вернет 3
    partialSum(1, 13, 3) - вернет 1
    ```
     */

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 2;
        System.out.println(partialSum(a, b, c));
    }

    public static int partialSum(int a, int b, int c) {
        int amount = 0;
        if (a == 13) {
            amount = 0;
        } else {
            if (b == 13) {
                amount = a;
            } else {
                if (c == 13) {
                    amount = a + b;
                } else {
                    amount = a + b + c;
                }
            }
        }
        return amount;
    }

}
