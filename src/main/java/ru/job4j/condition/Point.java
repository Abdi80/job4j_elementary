package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        x = Math.pow(x, 2);
        double y = y2 - y1;
        y = Math.pow(y, 2);
        double result = x + y;
        result = Math.sqrt(result);
        return result;
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = distance(-1, 3, 6, 2);
        System.out.println("result (-1, 3) to (6, 2) " + result);
    }
}