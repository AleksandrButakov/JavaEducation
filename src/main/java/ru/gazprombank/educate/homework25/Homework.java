package ru.gazprombank.educate.homework25;

public class Homework {
    /*
    Общий префикс
    - сделать статический публичный метод в `HomeWork` под названием `getPrefix`
    - метод должен принимать на вход 1 параметр `String[] strings`
    - метод должен найти общий префикс для всех строк в массиве
    - если общего префикса нет, то вернуть пустую строку
    - если общих префиксов одинаковой длины несколько, вернуть первый

    Пример
    ```
    getPrefix("hello, hel, hi, ops")               - вернет h
    getPrefix("test2", "test2", "test2Tr", "te")    - вернет te
    getPrefix("hey, hey1, hey man, heyyaaa")       - вернет hey
    ```
     */

    public static void main(String[] args) {
        String[] str = {"test2", "test2", "test2Tr", "te"};
        System.out.println("Result = " + getPrefix(str));
    }

    public static String getPrefix(String[] strings) {
        int minLength = strings[0].length();
        String sTemp = "";
        String prefix = "";

        for (String s : strings) {
            if (minLength > s.length()) minLength = s.length();
        }

        for (int i = 0; i < minLength; i++) {
            sTemp = strings[0].substring(i, i + 1);
            for (String s : strings) {
                if (sTemp.equals(s.substring(i, i + 1))) {

                } else {
                    return prefix;
                }
            }
            prefix += sTemp;
        }
        return prefix;
    }

}