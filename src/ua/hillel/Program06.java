package ua.hillel;

import ua.hillel.UiUtils.ProgramNameConstants;
import ua.hillel.UiUtils.ProgramResultConstants;
import ua.hillel.UiUtils.UiConstants;
import ua.hillel.UiUtils.UserEnterConstants;

import static java.lang.System.out;
import java.util.Scanner;

public class Program06 {

    public static void factorial() {
        long n;
        do
        {
            out.println(UiConstants.UI_DIVIDER_BLUE);
            out.println(ProgramNameConstants.PROGRAM6_NAME);
            out.println(UiConstants.UI_EMPTY_SPACE);
            out.println(UserEnterConstants.ENTER_INTEGER_RANGE_OF);

            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
            if(n < 0)
                out.println(UiConstants.UI_NEGATIVE_NUMBER_WARNING);
            else
            {
                long result = 1;

                if (n == 0 || n == 1)
                    out.println(n+"!  = "+result);

                for (int i = 2; i <= n; i++)
                {
                    result = result * i;
                    if (i >= n)
                    {
                        out.println(ProgramResultConstants.YOUR_ENTER_NUMBER + n);
                        out.println(ProgramResultConstants.PROGRAM6_RESULT + result);
                    }
                }
            }
        }
        while (n < 0);
    }
}