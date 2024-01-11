package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (isValid(x1) && isValid(y1) && isValid(x2) && isValid(y2)) {
            if (distance(x1, x2) == distance(y1, y2)) {
                result = Math.abs(x1 - x2);
            }
        }
        return result;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static int distance(int start, int finish) {
        int result;
        if (start == 0 && finish != 0) {
            result = finish;
        } else if (finish == 0 && start != 0) {
            result = start;
        } else {
            result = finish - start;
        }
        return result;
    }

 }
