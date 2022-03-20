package lesson1;

import java.beans.PropertyEditorSupport;

public class Main {
    public static void main(String[] args) {
        int num = 15;
        short exNum = 1;
        long numLong = 2500000000000000l;
        double num1 = 25.12;
        float num2 = 25.12f;
        char symbol = 's';
        boolean real = true;
        boolean unreal = false;

        float a = 2.5f;
        float b = 1.2f;
        float c = 3.5f;
        float d = 1.5f;

        int number1 = 1;
        int number2 = 2;
        evaluateExpression(a,b,c,d);
        System.out.println();
        System.out.println(numComparison(number1,number2));
        negativeOrPositive(number1);
        System.out.println(negativeOrPositiveV2(number1));
        helloBro("Люк");
        leapYear(2020);

    }


    /**
     * Метод вычисляющий выражение a * (b + (c / d))
     * @param num1 число с плавающей точкой
     * @param num2 число с плавающей точкой
     * @param num3 число с плавающий точкой
     * @param num4 число с плавающей точкой
     */
    private static void evaluateExpression(float num1, float num2, float num3, float num4) {
        float result = num1 * (num2 + (num3 / num4));
        System.out.printf("(%.2f * (%.2f + (%.2f/%.2f)) = %.2f ",num1,num2,num3,num4, result);
    }

    /**
     * Проверяем числа и возвращаем true или false
     * @param a целое число
     * @param b целое число
     * @return
     */
    private static boolean numComparison(int a, int b) {
        int result = a + b;
        if (result <=20 && result >= 10){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Проверяем число на отрицательное и положительное
     * @param a целое число
     */
    private static void negativeOrPositive(int a) {
        if (a < 0){
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("число положительное");
        }
    }

    /**
     * Вовзращаем true если число отрицательное
     * @param a целое число
     * @return возвращаем true или false в зависимости от переданного числа
     */
    private static boolean negativeOrPositiveV2(int a) {
        if (a < 0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Принимаем строку и объединяем ее с другой
     * @param a строка
     */
    private static void helloBro(String a) {
        System.out.println("Привет, да пребудет с тобой сила " + a);
    }

    private static void leapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год високсный");
        }
        else {
            System.out.println("Год не високосный");
        }
    }
}
