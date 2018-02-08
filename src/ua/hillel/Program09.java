package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

public class Program09 {
    // TODO: 2/8/18 method name shouldn't start from Upper case.
    public static void Celsius() {

    out.println((char) 27 + "[32m      Введите значение градусов в С:" + (char)27 + "[0m");
        Scanner sc = new Scanner(System.in);
    int ce = 0; //sc.nextInt();
    int fa = 9/5 + 32;

    // TODO: 2/8/18 remove the communication/interaction with user code to the other abstraction.

    if (sc.hasNextInt()){
        ce = sc.nextInt();
    } else {
    // TODO: 2/8/18 use a constants for string.
        out.println((char) 27 + "[31m                WARNING!" + (char)27 + "[0m");
        out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
        out.println((char) 27 + "[31m          Введите целое число!!!" + (char)27 + "[0m");
        out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");

        Celsius();
    }

    out.println((char) 27 + "[32m      Метод возвращает значение градусов в F:" + (char) 27 + "[0m");
    out.println(ce + fa);
    // TODO: 2/8/18 remove the communication/interaction with user code to the other abstraction.
    }
}
