package ru.job4j.converter;

public class Converter {
    private static final float RUBLE_TO_EURO_RATE = 70;
    private static final float RUBLE_TO_DOLLAR_RATE = 60;

    public static float rubleToEuro(float value) {
        return value / RUBLE_TO_EURO_RATE;
    }

    public static float rubleToDollar(float value) {
        return value / RUBLE_TO_DOLLAR_RATE;
    }

    public static void main(String[] args) {
        Converter converter = new Converter();
        float euro = converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = converter.rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollars.");
        float input = 140;
        float expected = 2;
        float output = converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        input = 180;
        expected = 3;
        output = converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3. Test result : " + passed);
    }
}
