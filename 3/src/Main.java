import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Введите нужные значения a и b");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt();
        b = scannerQ.nextInt();
        System.out.println("До обмена значениями\na = "+a+"\nb = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена значениями без промежуточной переменной\na = "+a+"\nb = "+b);
    }
    /*
    a=5;b=4;
    a=5+4;  a=9
    b=9-4;  b=5
    a=9-5;  a=4
     */
}
