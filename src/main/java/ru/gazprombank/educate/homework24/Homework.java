package ru.gazprombank.educate.homework24;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework {
    /*
    Коллекция из списка
    - сделать статический публичный метод в `HomeWork` под названием `getMapFromString`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть Map, где ключ это будет значение уникального элемента в листе, а значение это сколько
    раз мы его встречаем в листе

    Пример
    ```
    getMapFromString("123451222") - вернет
        1 -> 2
        2 -> 4
        3 -> 1
        4 -> 1
        5 -> 1
    getMapFromString("111100129") - вернет
        0 -> 2
        1 -> 5
        2 -> 1
        9 -> 1
    getMapFromString("") - вернет new Map
    ```
     */

    public static void main(String[] args) {
        String str = "123451222";
        System.out.println("Result = " + getMapFromString(str));

    }

    public static Map<Integer, Integer> getMapFromString(String str) {
        int number;
        int value;
        //char[] ch = str;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = Integer.parseInt(str.substring(i, i + 1));
                try {
                    value = map.get(number);
                } catch (Exception e) {
                    value = 0;
                }
                map.put(number, value + 1);
            }
        }
        return map;
    }

}