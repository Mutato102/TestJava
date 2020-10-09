public class Main {
    public static void main(String[] args) {
        int numbersArray[] = { 10, 15, 32, 100, 16, 11, 98, 36, 95, 33 };
        int biggest= numbersArray[0];// присваиваем переменной biggest 0 индекс массива
        int secondBiggest = numbersArray[0]; // присваиваем переменной secondBiggest тот же индекс массива
        System.out.println("Полученный массив: ");
        for (int i = 0; i < numbersArray.length; i++)
        {
            System.out.print(numbersArray[i] + "\t"); //Вывод массива
        }
        for (int i = 0; i < numbersArray.length; i++) //Проходимся по массиву
        {
            if (numbersArray[i] > biggest) // Если элемент массива больше чем значение biggest
            {
                secondBiggest = biggest; //Присваимваем значение biggest srcondBiggest
                biggest = numbersArray[i];// А biggest присваиваем значение текущего значения массива
            }
            else if (numbersArray[i] > secondBiggest && numbersArray[i] != biggest)
            {
                secondBiggest = numbersArray[i];
            }
        }
        System.out.println("\nВторое по величине число:" + secondBiggest);
    }
    /*
    1) sec =10; big =10
    2) sec=10; big=15
    3) sec=15; big=32
    4) sec=32; big =100
    5) -//-
    6) -//-
    7) sec=98; big=100
    8) -//-
    9) -//-
    10) -//-
     */
}
