package ru.gazprombank.educate.homework9;

public class Homework {
    /*
    Какое число меньше, а какое больше

    сделать статический публичный метод в HomeWork под названием isOrdered
    метод должен принимать на вход 4 параметра int first, int second, int third, boolean itsOk
    вернуть true если второе число second больше первого first, и третье число third больше второго second
    если флаг itsOk = true, то второе число second необязательно должно быть больше первого first, но должно быть меньше третьего third
    Пример

    isOrdered(1, 2, 4, false) - вернет true
    isOrdered(1, 2, 1, false) - вернет false
    isOrdered(1, 1, 2, true)  - вернет true
     */

    public static void main(String[] args) {

        int first = 4;
        int second = 5;
        int third = 8;
        boolean itsOk = false;
        System.out.println("Result = " + isOrdered(first, second, third, itsOk));

    }

    public static boolean isOrdered(int first, int second, int third, boolean itsOk) {

        boolean result = false;
        if (itsOk == false) {
            if (second > first && third > second) {
                result = true;
            } else {
                result = false;
            }
        } else {
            if (second < third) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }

}