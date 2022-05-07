package ru.gazprombank.educate.homework21;

public class Homework {
    /*
    Рекурсия с буквой `о`
    - сделать статический публичный метод в `HomeWork` под названием `endoo`
    - метод должен принимать на вход 1 параметр `String str`
    - метод должен вернуть строку, в которой все буквы `o` перемещены в конец строки
    - решение должно быть выполнено с применением рекурсии, без циклов

    Пример
    ```
    endoo("oore")    - вернет reoo
    endoo("oohoi")   - вернет hiooo
    endoo("oanotgo") - вернет antgooo
    ```
     */

    public static String strResult = "";
    public static String strTemp = "";
    public static int index = 0;

    public static void main(String[] args) {
        String str = "oore";
        System.out.println("Text = " + str + "  Result = " + endoo(str));
    }

    public static String endoo(String str) {
        if (!str.equals("") && !str.equals(null)) {
            if (index < str.length()) {
                if (str.length() > 0) {
                    if (str.substring(index, index + 1).equals("o")) {
                        strTemp += "o";
                    } else {
                        strResult += str.substring(index, index + 1);
                    }
                }
                index++;
                endoo(str);
            } else {
                strResult += strTemp;
            }
        }
        return strResult;
    }

}