package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

public class Program08 {
        // TODO: 2/8/18 method name shouldn't start from Upper case.
    public static void ChangeLine(){
        // TODO: 2/8/18 remove the communication/interaction with user code to the other abstraction.
        // TODO: 2/8/18 use a constants for string.
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
