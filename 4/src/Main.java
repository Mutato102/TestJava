import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String st = "Current task posted for Java developers developers";
        String[] words = st.split(" "); //Массив слов
        HashMap<String,Integer> keyValue = new HashMap<String,Integer>(); //Создаем карточку, где слова -ключи
        for (int i=0; i<= words.length-1; i++) { //Пробегаемся по массиву слов
            if (keyValue.containsKey(words[i])) { //проверяем ключ(слово) на наличие
                int counter = keyValue.get(words[i]); //счетчик
                keyValue.put(words[i], counter+1); //Добавляем ключ и значение в карту, так как слово уже это имеется,
                //то увеличиваем считчик на 1, причем слово в карту по новой не добавляется, так как ключ должен быть уникальным
            }
            else {
                keyValue.put(words[i], 1);// Если слово использовалось только один раз, его значение будет 1
            }
        }
        System.out.println(keyValue);
    }
}
