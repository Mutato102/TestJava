import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputString, reversedString = "";
        Scanner scanner = new Scanner(System.in);
        int stringLength;
        System.out.println("Введите число или строку");
        inputString = scanner.nextLine(); //считываем строку
        stringLength = inputString.length(); //присваиваем переменной количество введеных символов
        for (int x = stringLength -1; x>=0; x--) {
            //В конечном результате reversedString получится перевертышем, так как
            //метод charAt() возвращает символ, расположенный по указанному индексу строки
            //а пробегаемся мы по строке начиная от конца
            reversedString += inputString.charAt(x);
        }
        System.out.println("перевернутое значение: " + reversedString);
        if(inputString.equals(reversedString)) //Сравниваем последовательность символов в строках
            System.out.println("Введенное значение является палиндромом");
        else
            System.out.println("Введенное значение не является палиндромом");
    }
}
