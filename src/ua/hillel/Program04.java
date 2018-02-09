package ua.hillel;

import ua.hillel.UiUtils.ProgramNameConstants;
import ua.hillel.UiUtils.UiConstants;
import ua.hillel.UiUtils.UserEnterConstants;
import static java.lang.System.out;
import java.util.Scanner;

public class Program04 {

    public static void fibonacci(){
        out.println(UiConstants.UI_DIVIDER_BLUE);
        out.println(ProgramNameConstants.PROGRAM4_NAME);
        out.println(UiConstants.UI_EMPTY_SPACE);
        out.println(UserEnterConstants.ENTER_INTEGER);

        int a = 0;
        int b = 1;
        int n = 0;
        int sumFib;

        Scanner s = new Scanner(System.in);

// Check for an integer
            if (s.hasNextInt()){
                n = s.nextInt();
            } else {
                out.println(UiConstants.UI_WARNING_MESSAGE);
                out.println(UiConstants.UI_DEVIDER_RED);
                out.println(UiConstants.UI_INTEGER_MESSAGE);
                out.println(UiConstants.UI_DEVIDER_RED);
                fibonacci();
            }
// Implementation of the task
        for(int i = 0; i < n; i++){
            sumFib = a + b;
            a = b;
            b = sumFib;
            out.print(sumFib + " ");
        }
    }
}



