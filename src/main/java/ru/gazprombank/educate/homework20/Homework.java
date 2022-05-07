package ru.gazprombank.educate.homework20;

public class Homework {
    /*
    Рекурсия Yo
    - сделать статический публичный метод в `HomeWork` под названием `yoYo`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть сколько раз слово `yo` встречается в исходной строке
    - решение должно быть выполнено с применением рекурсии, без циклов

    Пример
    ```
    yoYo("xhyoxx")   - вернет 1
    yoYo("nyonnyon") - вернет 2
    yoYo("yo")       - вернет 1
    ```
     */

    public static int count = 0;
    public static int index = 0;
    public static String s;

    public static void main(String[] args) {
        String str = "y";
        System.out.println("Number = " + yoYo(str));
    }

    public static int yoYo(String str) {
        if (str.length() > 0) {
            if (index + 1 < str.length()) {
                s = str.substring(index, index + 2);
                if (s.equals("yo")) {
                    count++;
                }
                index++;
                yoYo(str);
            }
        }
        return count;
    }

}
