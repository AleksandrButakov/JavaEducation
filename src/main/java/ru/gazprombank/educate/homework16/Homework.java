package ru.gazprombank.educate.homework16;

import org.jetbrains.annotations.NotNull;

public class Homework {
    /*
    Строка со звездочками
    - сделать статический публичный метод в `HomeWork` под названием `starKill`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть строку, в которой символ `*` и все соседние с ним символы, удалены

    Пример
    ```
    starKill("cd*zq")    - вернет "cq"
    starKill("ab**cd")   - вернет "ad"
    starKill("wacy*xko") - вернет "wacko"
    ```
     */

    public static void main(String[] args) {
        String str = "sm**eil*ly";
        System.out.println(str);
        System.out.println("Returned string: " + starKill(str));
    }

    public static String starKill(@NotNull String str) {
        int textLength = str.length();
        String newLine = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < textLength; i++) {
            if (textLength > 0) {
                if (ch[i] == '*') {
                    // пропускаем присваивание символа строке
                } else {
                    if (i < textLength-1 && ch[i+1] == '*') {
                        // пропускаем присваивание символа строке
                    } else {
                        if (i > 0 && ch[i-1] == '*') {
                            // пропускаем присваивание символа строке
                        } else {
                            newLine += Character.toString(ch[i]);
                        }
                    }
                }
            }
        }
        return newLine;
    }

}
