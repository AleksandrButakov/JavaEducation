package ru.gazprombank.educate.homework11;

public class Homework {
    /*
    FizzBuzz головоломка
    - сделать статический публичный метод в `HomeWork` под названием `fizzyWizzy`
    - метод должен принимать на вход 1 параметр `int n`
    - метод должен вернуть строковое представление числа со знаком `!` в конце
    - если число делится на 3, то надо вернуть `Fizz!`
    - если число делится на 5, то надо вернуть `Buzz!`
    - если число делится и на 3 и на 5, то надо вернуть `FizzBuzz!`

    Пример
    ```
    fizzyWizzy(1) - вернет "1!"
    fizzyWizzy(2) - вернет "2!"
    fizzyWizzy(3) - вернет "Fizz!"
    ```
     */

    public static void main(String[] args) {
        int n = 1;
        System.out.println(fizzyWizzy(n));
    }

    public static String fizzyWizzy(int n) {
        String s = null;
        if (n % 3 == 0) s = "Fizz!";
        if (n % 5 == 0) s = "Buzz!";
        if (n % 3 == 0 && n % 5 == 0) s = "FizzBuzz!";
        if (s == null) s = String.valueOf(n) + "!";
        return s;
    }

}
