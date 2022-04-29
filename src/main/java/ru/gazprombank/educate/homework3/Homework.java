package ru.gazprombank.educate.homework3;

/*
    сделать статический публичный метод в HomeWork под названием printMatrix
    метод должен принимать двумерный прямоугольный массив чисел
    метод должен выводить входящий массив в консоль по примеру если на входе {{1, 2, 4, 2, 1, 3}, {2, 3, 4, 1, 3, 2,}, {1, 3, 4, 5, 6, 1}}
    1 2 4 2 1 3
    2 3 4 1 3 2
    1 3 4 5 6 1
 */

public class Homework {

    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 4, 2, 1, 3}, {2, 3, 4, 1, 3, 2,}, {1, 3, 4, 5, 6, 1}};
        printMatrix(myArray);
    }

    public static void printMatrix(int[][] myArray) {
        for (int j = 0; j < myArray.length; j++) {
            for (int i = 0; i < myArray[0].length; i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(myArray[j][i]);
            }
            if (j != myArray.length-1) System.out.print("\n");
        }
    }

    /*
        public static void printMatrix(int[][] myArray) {
        for (int j = 0; j < myArray.length; j++) {
            for (int i = 0; i < myArray[0].length; i++) {
                System.out.print(myArray[j][i] + " ");
            }
            System.out.print("\n");
        }
    }
     */

}