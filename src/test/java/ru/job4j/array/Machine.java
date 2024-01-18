package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int change = money - price;
        int j = 0;
        for (int i = 0; i < coins.length; i++) {
            while (change >= coins[i]) {
                result[j] = coins[i];
                j++;
                change -= coins[i];
            }
        }
        int size = j;
        return Arrays.copyOf(result, size);
    }
}