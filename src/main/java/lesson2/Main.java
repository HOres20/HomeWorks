package lesson2;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2 = new int[8];
        Reverse(arr1);
        printArr(arr1);
        insertArr();
    }

    /**
     * Метод меняющий 0 в массиве на 1 и наоборот.
     * @param arr массив
     */
    private static void Reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    private static void insertArr() {

    }







    /**
     * Метод выводит массив на экран
     * @param arr
     */
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
