package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollars.");
    }
}
