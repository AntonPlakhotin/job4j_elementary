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
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float input2 = 120;
        float expected2 = 2;
        float output2 = Converter.rubleToDollar(input);
        boolean passed2 = expected2 == output2;
        System.out.println("120 rubles are 2. Test result : " + passed);

        float input3 = 2;
        float expected3 = 120;
        float output3 = Converter.dolarToRuble(input);
        boolean passed3 = expected3 == output3;
        System.out.println("2 dollars are 120. Test result : " + passed);

        float input4 = 3;
        float expected4 = 210;
        float output4 = Converter.euroToRuble(input);
        boolean passed4 = expected4 == output4;
        System.out.println("3 euro are 210. Test result : " + passed);

    }
}
