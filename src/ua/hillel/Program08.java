package ua.hillel;

import java.util.Scanner;
import static java.lang.System.out;
import ua.hillel.UiUtils.ProgramNameConstants;
import ua.hillel.UiUtils.UserEnterConstants;
import ua.hillel.UiUtils.ProgramResultConstants;
import ua.hillel.UiUtils.UiConstants;

public class Program08 {

    public static void changeLine(){
        out.println(UiConstants.UI_DIVIDER_BLUE);
        out.println(ProgramNameConstants.PROGRAM8_NAME);
        out.println(UiConstants.UI_EMPTY_SPACE);

        Scanner input = new Scanner(System.in);
        StringBuffer line = new StringBuffer();

            out.println(UserEnterConstants.ENTER_STRING);
        line.append(input.nextLine());
            out.println(UiConstants.UI_EMPTY_SPACE);
            out.println(ProgramResultConstants.PROGRAM8_RESULT);
        line.reverse();

        out.println(line);

        // Решение задачи без использования консольного ввода
        /*
        StringBuffer buffer = new StringBuffer("java interview");
        buffer.reverse();
        out.println("Было java interview, стало " + buffer); */
    }
}
