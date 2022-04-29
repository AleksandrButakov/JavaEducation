package ru.gazprombank.educate.homework15;

public class Homework {
    /*
    Преобразование строки
    - сделать статический публичный метод в `HomeWork` под названием `repeatChar`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть строку, где каждый символ из исходной строки продублирован

    Пример
    ```
    repeatChar("The")      - вернет "TThhee"
    repeatChar("AAbb")     - вернет "AAAAbbbb"
    repeatChar("Hi-There") - вернет "HHii--TThheerree"
    ```
     */

    public static void main(String[] args) {
        String str = "The";
        System.out.println(repeatChar(str));
    }

    public static String repeatChar(String str) {
        char[] symbol;
        String duplicatedString = "";
        if (str.length() != 0) {
            symbol = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                duplicatedString += Character.toString(symbol[i]) + symbol[i];
            }
            return duplicatedString;
        } else {
            return "";
        }
    }

}
