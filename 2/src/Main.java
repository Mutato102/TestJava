import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, temp;
        System.out.println("Введите значения a и b");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt(); //Считываем значение а
        b = scannerQ.nextInt(); //Считываем значение б
        System.out.println("До обмена значениями " + a + b);
        temp = a; //временной переменной присваиваем значение а
        a = b; // а присвае=иваем значение б
        b = temp; //б присваиваем значение а, так как до этого временной переменной присвоили это значение
        System.out.println("После обмена значениями " + a + b);
    }
}
