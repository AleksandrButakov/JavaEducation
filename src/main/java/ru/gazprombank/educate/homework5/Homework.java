package ru.gazprombank.educate.homework5;

/*
Центр слова

сделать статический публичный метод в HomeWork под названием middleThree
метод должен принимать на вход строку
метод должен найти 3 символа в центре строки
если длина строки меньше 3, вернуть строку как она есть
Пример

middleThree("bunny")  - вернет "unn"
middleThree("peter")  - вернет "ete"
middleThree("Jamaica")  - вернет "mai"
 */

public class Homework {

    public static void main(String[] args) {
        String text = "candy";
        System.out.println(middleThree(text));
    }

    public static String middleThree(String text) {

        if (text.length() <= 3) {
            // возвращаем строку целиком

        } else {
            // находим три символа в центре строки
            if (text.length() <= 5) {
                int length = text.length();
                System.out.println(text.substring(length / 2 - 1, length / 2 - 1 + 3));
            }
        }
        return text;
    }

}