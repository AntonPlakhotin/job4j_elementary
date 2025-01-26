package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result =  value / 60;
        return result;
    }

    public static float dolarToRuble(float value) {
        float result =  value * 60;
        return result;
    }

    public static float euroToRuble(float value) {
        float result =  value * 70;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float ruble1 = Converter.dolarToRuble(3);
        System.out.println("3 dollars are " + ruble1 + " rubles.");
        float ruble2 = Converter.euroToRuble(3);
        System.out.println("3 euro are " + ruble2 + " rubles.");

    }
}
