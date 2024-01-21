package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.length() == 1) {
                result = input;
            } else if (symbol == input.charAt(i)) {
                counter++;
            } else if (symbol != input.charAt(i) && counter != 1) {
                result = result + symbol + counter;
                symbol = input.charAt(i);
                counter = 1;
            } else {
                result = result + symbol;
                symbol = input.charAt(i);
                counter = 1;
            }
            if (i == input.length() - 1 && input.length() != 1 && counter != 1) {
                result = result + symbol + counter;
            } else if (i == input.length() - 1 && input.length() != 1 && counter == 1) {
                result = result + symbol;
            }

        }

        return result;
    }
}
