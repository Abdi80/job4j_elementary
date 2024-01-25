package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }

    public static void main(String[] args) {
        int result = max(1, 7);
        System.out.println(result);
        result = max(89, 5);
        System.out.println(result);
        result = max(4, 4);
        System.out.println(result);
    }
}
