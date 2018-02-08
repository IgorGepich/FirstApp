package ua.hillel;

import static java.lang.System.out;

import java.util.Scanner;

public class Program04 {
        // TODO: 2/8/18 method name shouldn't start from Upper case.
    public static void Fibonacci(){
        // TODO: 2/8/18 remove the communication/interaction with user code to the other abstraction.
        // TODO: 2/8/18 use a constants for string.
        out.println((char) 27 + "[34m              Fibonacci" + (char)27 + "[0m");
        out.println((char) 27 + "[32m          Введите целое число: " + (char)27 + "[0m");

        int a = 0;
        int b = 1;
        int n = 0;
        int sum_fib;// FIXME: 2/8/18 nameConvention "_"

        Scanner s = new Scanner(System.in);
        // FIXME: 2/8/18 Russian aiYaiYai!
        // Проверка на ввод целого числа
        if (s.hasNextInt()){
            n = s.nextInt();
        } else {
            // TODO: 2/8/18 remove the communication/interaction with user code to the other abstraction.
            // TODO: 2/8/18 use a constants for string.
            out.println((char) 27 + "[31m                WARNING!" + (char)27 + "[0m");
            out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
            out.println((char) 27 + "[31m          Введите целое число!!!" + (char)27 + "[0m");
            out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
            out.println("");
            Fibonacci();
        }
        // FIXME: 2/8/18 Russian aiYaiYai!
        // Реализация задачи
        for(int i = 0; i < n; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            out.print(sum_fib + " ");
        }
    }
}



