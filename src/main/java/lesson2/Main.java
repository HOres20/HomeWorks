package lesson2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arr4 = new int[4][4];
        Reverse(arr1);
        printArr(arr1);
        System.out.println();
        insertArr(arr2);
        printArr(arr2);
        System.out.println();
        multiplicationArr(arr3);
        printArr(arr3);
        System.out.println();
        fillArray(arr4);
        changeArr(arr4);
        printArr(arr4);


    }

    /**
     * Метод меняющий 0 в массиве на 1 и наоборот.
     *
     * @param arr массив
     */
    private static void Reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    /**
     * Метод заполняющий массив значениями  0 3 6 9 12 15 18 21;
     *
     * @param arr - массив
     */
    private static void insertArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    /**
     * Метод умножает числа меньше 6 на 2, в массиве
     * @param arr массив
     */
    private static void multiplicationArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    private static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                Random random = new Random();
                arr[i][j] = random.nextInt(5);
            }
        }

    }

    /**
     * Метод выводит массив на экран
     *
     * @param arr массив
     */
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void changeArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] == arr[0][0]){
                    arr[i][j] = 1;
                }
                else if (arr[i][j] == arr[1][1]){
                    arr[i][j] = 1;
                }
                else if (arr[i][j] == arr[2][2]){
                    arr[i][j] = 1;
                }
                else if (arr[i][j] == arr[3][3]){
                    arr[i][j] = 1;
                }
            }
        }
    }

    /**
     * Перегрузка метода благодоря которой выводим на экран многомерный массив
     * @param arr массив
     */
    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
