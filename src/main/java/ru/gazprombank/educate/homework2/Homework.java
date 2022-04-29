package ru.gazprombank.educate.homework2;

/*
    сделать статический публичный метод в HomeWork под названием calculateTriangleArea
    метод должен принимать три стороны треугольника
    метод должен посчитать площадь треугольника
    метод должен возвращать площадь треугольника на основе длины входящих трех сторон (с округлением до тысячных)
    если по переданным сторонам существование треугольника невозможно, то должно быть выброшено исключение ru.gazprombank.educate.homework2.TriangleExistException
 */

public class Homework {

    public static void main(String[] args) throws TriangleExistException {

        // зададим длины сторон треугольника
        int a = 8;
        int b = 4;
        int c = 7;
        System.out.println("Площадь треугольника на основе длины входящих трех сторон " +
                "(с округлением до тысячных) = " + calculateTriangleArea(a, b, c));
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        double s = 0;
        if (a + b > c && b + c > a && a + c > b) {
            // треугольник с такими сторонами существует
            // найдем площадь треугольника по трем сторонам
            double p = Double.valueOf (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            s = (double) Math.round(s*1000)/1000;
        } else {
            // треугольник с такими сторонами не существует
            throw new TriangleExistException();
        }
        return s;
    }

}