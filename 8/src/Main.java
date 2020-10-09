import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter, num, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Введите " + num + " чисел");
        //Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }
        // печатаем массив перед пузырьковой сортировкой
        System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));
        // сортируем массив
        bubbleSort(array);
        // печатаем массив после пузырьковой сортировки
        System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));
    }
    // метод пузырьковой сортировки
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) { //Если текущий элемент
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    /*
    Пример: Исходный массив - [34,56,12,11,78]
    1.0) -//-
    1.1) [34,12,56,11,78]
    1.2) [34,12,11,56,78]
    1.3) [34,12,11,56,78]
    2.0) [12,34,11,56,78]
    2.1) [12,11,34,56,78]
    2.2) [12,11,34,56,78]
    3.0) [11,12,34,56,78]
    3.1) [11,12,34,56,78]
     */
}