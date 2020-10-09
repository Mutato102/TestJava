import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine(); //Считываем строку введенную с клавиатуры
        char symbols[] = st.toCharArray();  // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке
        for(int x= symbols.length-1; x>=0; x--) {
            System.out.print(symbols [x]); //Вывод в обратном порядке
        }
    }
}
