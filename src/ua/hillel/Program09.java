package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

public class Program09 {

    public static void Celsius() {

    out.println((char) 27 + "[32m      Введите значение градусов в С:" + (char)27 + "[0m");
        Scanner sc = new Scanner(System.in);
    int ce = 0; //sc.nextInt();
    int fa = 9/5 + 32;


        if (sc.hasNextInt()){
            ce = sc.nextInt();
        } else {
            out.println((char) 27 + "[31m                WARNING!" + (char)27 + "[0m");
            out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
            out.println((char) 27 + "[31m          Введите целое число!!!" + (char)27 + "[0m");
            out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
            Celsius();
        }
        out.println((char) 27 + "[32m      Метод возвращает значение градусов в F:" + (char) 27 + "[0m");
        out.println(ce + fa);
    }
}
