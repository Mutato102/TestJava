import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        int a,b,c;
        System.out.println("Данно выражение (a+b/c)*4");
        System.out.println("Введите a, b и c");
        Scanner scannerQ = new Scanner(System.in);
        a = scannerQ.nextInt(); //Считываем значение a
        b = scannerQ.nextInt(); //Считываем значение b
        c = scannerQ.nextInt(); //Считываем значение с
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
// JavaScript code in a String
        String script1 = (String)"function hello(a,b,c) { print ((a+b/c)*4);}";
// evaluate script //Выполнить main.js
        engine.eval(script1);
        Invocable inv = (Invocable) engine;
        inv.invokeFunction("hello",    a, b , c );
    }
}