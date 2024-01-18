package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (true) {
            if (array[i] + array[j] == target) {
                result = new int[2];
                result[0] = i;
                result[1] = j;
                break;
            } else if (array[i] + array[j] < target) {
                i++;
                if (i == j) {
                    break;
                }
            } else if (array[i] + array[j] > target) {
                j--;
                if (j == i) {
                    break;
                }
            }

        }
        return result;
    }
}
