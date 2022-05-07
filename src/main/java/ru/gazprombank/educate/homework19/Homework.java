package ru.gazprombank.educate.homework19;

public class Homework {
    /*
    Часть строки
    - сделать статический публичный метод в `HomeWork` под названием `longestStreak`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть длину самой длинной цепочки одинаковых символов

    Пример
    ```
    longestStreak("hayyeu")        - вернет 2
    longestStreak("XPNzzzddOOOxx") - вернет 3
    longestStreak("")              - вернет 0
    ```
     */

    public static void main(String[] args) {
        String str = "Hello world!!!";
        System.out.println("CountMax = " + longestStreak(str));
    }

    public static int longestStreak(String str) {
        int countCurrent = 0;
        int countMax = 0;
        char[] chArray = str.toCharArray();
        char ch;
        if (chArray.length > 0) {
            for (int i = 0; i < chArray.length; i++) {
                if (i > 0) {
                    if (chArray[i - 1] == chArray[i]) {
                        countCurrent++;
                        if (countMax <= countCurrent) {
                            countMax = countCurrent + 1;
                        }
                    } else {
                        countCurrent = 0;
                    }
                }
            }
        }
        return countMax;
    }

}
