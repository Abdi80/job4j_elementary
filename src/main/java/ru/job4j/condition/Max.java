package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;

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
