package ru.gazprombank.educate.homework23;

public class Homework {
    /*
    Строка в скобках
    - сделать статический публичный метод в `HomeWork` под названием `insideBrackets`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть строку, которая находится между символами `[` и `]`, вместе с символами

    Пример
    ```
    insideBrackets("xyz[abc]123") - вернет [abc]
    insideBrackets("x[hello]")    - вернет [hello]
    insideBrackets("[xy]1")       - вернет [xy]
    ```
     */

    public static void main(String[] args) {
        String str = "xyz[abc]123";
        System.out.println("Text = " + str + "Result = " + insideBrackets(str));
    }

    public static String insideBrackets(String str) {
        String strResult = "";
        boolean record = false;
        if (str.length() > 1) {
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("[")) record = true;
                if (str.substring(i, i + 1).equals("]")) {
                    record = false;
                    strResult += str.substring(i, i + 1);
                }
                if (record) {
                    strResult += str.substring(i, i + 1);
                }
            }
        }

        return strResult;
    }

}
