package ru.gazprombank.educate.homework18;

public class Homework {
    /*
    2 массива строк
    - сделать статический публичный метод в `HomeWork` под названием `matchingChar`
    - метод должен принимать на вход 2 параметра `String[] a, String[] b`
    - строки в массивах могут быть пустыми
    - необходимо сравнить элементы обоих массивов (первый с первым, второй со вторым и т.д.), и посчитать
    количество раз, когда первый символ в обеих не пустых строках совпадает

    Пример
    ```
    matchingChar({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) - вернет 1
    matchingChar({"aa", "bb", "cc"}, {"aaa", "b", "bb"})  - вернет 2
    matchingChar({"aa", "bb", "cc"}, {"", "", "ccc"})     - вернет 1
    ```
     */

    public static void main(String[] args) {
        String[] a = {"abc", "bcv", "sd"};
        String[] b = {"rt", "etr", "ss"};
        System.out.println("Number of matches = " + matchingChar(a, b));
    }

    public static int matchingChar(String[] a, String[] b) {
        int lengthArray;
        int count = 0;
        if (a.length < b.length) {
            lengthArray = a.length;
        } else {
            lengthArray = b.length;
        }

        for (int i = 0; i < lengthArray; i++) {
            if (a[i].length() > 0 && b[i].length() > 0) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }

}
