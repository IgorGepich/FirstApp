package ua.hillel;

import ua.hillel.UiUtils.UiConstants;

import java.util.Scanner;

import static java.lang.System.out;

public class Program09 {

    public static void celsius() {
    out.println((char) 27 + "[32m      Введите значение градусов в С:" + (char)27 + "[0m");
        Scanner sc = new Scanner(System.in);
    int ce = 0; //sc.nextInt();
    int fa = 9/5 + 32;


        if (sc.hasNextInt()){
            ce = sc.nextInt();
        } else {
            out.println(UiConstants.UI_WARNING_MESSAGE);
            out.println(UiConstants.UI_DEVIDER_RED);
            out.println(UiConstants.UI_INTEGER_MESSAGE);
            out.println(UiConstants.UI_DEVIDER_RED);
            celsius();
        }
        out.println((char) 27 + "[32m      Метод возвращает значение градусов в F:" + (char) 27 + "[0m");
        out.println(ce + fa);
    }
}
