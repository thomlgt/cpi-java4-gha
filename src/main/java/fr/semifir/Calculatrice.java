package fr.semifir;

public class Calculatrice {


    public static int addition(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int soustraction(int... numbers) {
        int result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(i != 0) {
                result -= numbers[i];
            }
        }
        return result;
    }

    public static int multiplication(int num1, int num2) {
        return num1*num2;
    }

    public static int division(int num1, int num2) {
        return num1/num2;
    }
}
