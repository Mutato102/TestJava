public class Main {
    public static void main(String[] args) {
        String st1 = " Мы готовимся     к интервью   на вакансию    Java разработчика";
        char[] charsArray = st1.toCharArray(); //Преобразовываем нашу строку в массив символов
         StringBuffer strB = new StringBuffer(); //создаем пустой (не содержащий символов) объект типа StringBuffer
        for (int i = 0; i < charsArray.length; i++)
        {
            if( (charsArray[i] != ' ') && (charsArray [i] != '\t') )// Если символ не является пробелом или табуляцией
            {
                strB.append(charsArray [i]); //Конкатенируем строки с помощью метода append
            }
        }
        System.out.println(strB);
    }
}
