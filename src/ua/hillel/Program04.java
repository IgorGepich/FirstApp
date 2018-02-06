package ua.hillel;

import static java.lang.System.out;

import java.util.Scanner;

public class Program04 {

    public static void Fibonacci(){

        out.println((char) 27 + "[34m              Fibonacci" + (char)27 + "[0m");
        out.println((char) 27 + "[32m          Введите целое число: " + (char)27 + "[0m");

        int a = 0;
        int b = 1;
        int n = 0;
        int sum_fib;

        Scanner s = new Scanner(System.in);

            // Проверка на ввод целого числа
            if (s.hasNextInt()){
                n = s.nextInt();
            } else {
                out.println((char) 27 + "[31m                WARNING!" + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
                out.println((char) 27 + "[31m          Введите целое число!!!" + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
                out.println("");
                Fibonacci();
            }
        // Реализация задачи
        for(int i = 0; i < n; i++){
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            out.print(sum_fib + " ");
        }
    }
}



