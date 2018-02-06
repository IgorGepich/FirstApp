package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

public class Program08 {

    public static void ChangeLine(){
        out.println((char) 27 + "[34mМетод переставляющий символы в строке в обратном порядке:  " + (char)27 + "[0m");

        Scanner input = new Scanner(System.in);
        StringBuffer line = new StringBuffer();

            out.println((char) 27 + "[32m          Введите произвольную строку: " + (char)27 + "[0m");
        line.append(input.nextLine());
            out.println((char) 27 + "[32m      Метод возвращает строку в обратном порядке:" + (char)27 + "[0m");
        line.reverse();

            out.println(line);

        // Решение задачи без использования консольного ввода
        /*
        StringBuffer buffer = new StringBuffer("java interview");
        buffer.reverse();
        out.println("Было java interview, стало " + buffer); */
    }
}
