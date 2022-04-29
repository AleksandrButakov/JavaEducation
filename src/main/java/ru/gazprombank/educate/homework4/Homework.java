package ru.gazprombank.educate.homework4;

/*
    сделать статический публичный метод в HomeWork под названием randomMatrix
    метод должен принимать двумерный массив чисел произвольной длины
    метод должен заполнять случайными числами (отличными от 0)
    метод должен вернуть заполненный массив`
*/

public class Homework {

    public static void main(String[] args) {
        // случайно заполним массив
        int yArraySize = (int) (9 * Math.random()) + 1;
        int xArraySize = (int) (9 * Math.random()) + 1;
        int[][] myArray1 = new int[yArraySize][xArraySize];

        for (int i = 0; i < (yArraySize) ; i++) {
            for (int j = 0; j < (xArraySize); j++) {
                myArray1[i][j] = (int) (9 * Math.random()) + 1;
            }
        }
        //int[][] myArray1 = {{1, 2, 3, 4}, {5, 6, 7, 1, 3, 2,}, {8, 9, 0, 1}};
        int[][] myArray2 = randomMatrix(myArray1);

    }

    public static int[][] randomMatrix (int[][] myArray){
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (9 * Math.random()) + 1;
            }
        }
        return myArray;
    }

}