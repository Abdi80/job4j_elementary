package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiperimetr = (a + b + c) / 2;
        double result = semiperimetr * (semiperimetr - a) * (semiperimetr - b) * (semiperimetr - c);
        return Math.sqrt(result);
    }

    public static void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
