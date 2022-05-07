package ru.gazprombank.educate.homework17;

public class Homework {
    /*
    Массив строк
    - сделать статический публичный метод в `HomeWork` под названием `wordsCount`
    - метод должен принимать на вход 2 параметра `String[] words, int len`
    - метод должен вернуть количество строк из массива, длина которых равны `len`

    Пример
    ```
    wordsCount({"a", "bb", "b", "ccc"}, 1) - вернет 2
    wordsCount({"a", "bb", "b", "ccc"}, 3) - вернет 1
    wordsCount({"a", "bb", "b", "ccc"}, 4) - вернет 0
    ```
     */

    public static void main(String[] args) {
        String[] words = {"Test", "words", "len", "name", "is"};
        int len = 4;
        System.out.println("Count = " + wordsCount(words, len));
    }

    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (String str : words) {
            if (str.length() == len) count++;
        }
        return count;
    }

}
