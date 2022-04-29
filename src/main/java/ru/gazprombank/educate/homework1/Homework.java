package ru.gazprombank.educate.homework1;

/*
    - сделать статический публичный метод в `HomeWork` под названием `punctuationCount`
    - метод должен принимать на вход строку
    - метод должен посчитать в строке количество знаков пунктуации
    - метод должен возвращать количество знаков пунктуации во входящей строке
 */

public class Homework {
    public static void main(String[] args) {

        String text = "Подсчитываем количество знаков препинания в предложении, выводим результат в консоль.";
        System.out.println("Количество знаков пунктуации во входящей строке = " + punctuationCount(text));

    }

    public static int punctuationCount(String text) {

        int numberPunctuationMarks = 0;
        for (char el : text.toCharArray()) {
            if (el == '!' || el == '\"' || el == '#' || el == '$' || el == '%' || el == '&' || el == '\'' ||
                    el == '(' || el == ')' || el == '*' || el == '+' || el == ',' || el == '-' || el == '.'
                    || el == '/' || el == ':' || el == ';' || el == '<' || el == '=' || el == '>' || el == '?'
                    || el == '@' || el == '[' || el == '\\' || el == ']' || el == '^' || el == '_' || el == '`'
                    || el == '{' || el == '|' || el == '}' || el == '~') numberPunctuationMarks++;

        }

        return numberPunctuationMarks;
    }

}