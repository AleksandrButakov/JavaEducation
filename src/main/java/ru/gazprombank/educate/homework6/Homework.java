package ru.gazprombank.educate.homework6;

public class Homework {

    /*
    Размер штрафа

    сделать статический публичный метод в HomeWork под названием speedingFine
    метод должен принимать на вход 2 параметра int speed, boolean isHoliday
    метод должен определить размер штрафа
    если скорость speed равна 60 или меньше, то штраф будет равен 0
    если скорость speed больше 60 и меньше 80 включительно, то штраф будет равен 100
    если скорость speed больше 81, то штраф будет равен 200
    однако, если флаг isHoliday = true, то скорость speed может быть выше на 5 для всех случаев
    Пример

    speedingFine(60, false)  - вернет 0
    speedingFine(65, false)  - вернет 100
    speedingFine(65, true)  - вернет 0
     */

    public static void main(String[] args) {
        // int[] speed = {43, 60, 78, 81, 85, 150};
        int speed = 62;
        boolean isHoliday = false;
        System.out.println("Размер штрафа составляет: " + speedingFine(speed, isHoliday));
    }

    public static int speedingFine(int speed, boolean isHoliday) {
        int fine = 0;  // размер штрафа
        int speedIncrease = 0;  // переменная для увеличения скорости на 5 км
        if (isHoliday == true) speedIncrease = 5;

        // если скорость speed равна 60 или меньше, то штраф будет равен 0
        if (speed - speedIncrease <= 60) fine = 0;

        // если скорость speed больше 60 и меньше 80 включительно, то штраф будет равен 100
        if (speed - speedIncrease > 60 && speed - speedIncrease <= 80) fine = 100;

        // если скорость speed больше 81, то штраф будет равен 200
        if (speed - speedIncrease > 80) fine = 200;

        return fine;
    }

}