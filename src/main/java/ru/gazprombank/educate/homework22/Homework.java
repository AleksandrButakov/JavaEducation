package ru.gazprombank.educate.homework22;

public class Homework {
    /*
    Рекурсия деления `-`
    - сделать статический публичный метод в `HomeWork` под названием `hyphenSplit`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть строку, в которой все одинаковые символы разделены символом `-`
    - решение должно быть выполнено с применением рекурсии, без циклов

    Пример
    ```
    endoo("hello") - вернет hel-lo
    endoo("xxyy")  - вернет x-xy-y
    endoo("aaaa")  - вернет a-a-a-a
    ```
     */

    public static int index = 0;
    public static String strResult = "";
    public static String strTemp = "";

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Text = " + str + "  Result = " + hyphenSplit(str));
    }

    public static String hyphenSplit(String str) {
        if (!str.equals("") && !str.equals(null)) {
            if (index < str.length()) {
                if (index > 0) {
                    if (str.substring(index - 1, index).equals(str.substring(index, index + 1))) {
                        strResult += "-";
                    }
                    strResult += str.substring(index, index + 1);
                } else {
                    strResult = str.substring(index, index + 1);
                }
            }
            if (index == str.length()) {
                return strResult;
            }
            index++;
            hyphenSplit(str);
        }
        return strResult;
    }

}