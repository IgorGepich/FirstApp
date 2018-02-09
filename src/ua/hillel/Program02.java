package ua.hillel;

import java.util.Random;
import static java.lang.System.out;
import ua.hillel.UiUtils.ProgramNameConstants;
import ua.hillel.UiUtils.ProgramResultConstants;
import ua.hillel.UiUtils.UiConstants;

public class Program02 {

    public static void say(){
        out.println(UiConstants.UI_DIVIDER_BLUE);
        out.println(ProgramNameConstants.PROGRAM2_NAME);
        out.println(UiConstants.UI_EMPTY_SPACE);
//Create an array of size n
        int[] firstArray = new int[40];
        Random rand = new Random();

        for (int i = 0; i < firstArray.length; i++)
//Fill the array with random numbers of the range [0 ... 99]
            firstArray[i] = rand.nextInt(100);
        for (int i : firstArray)
//Display the array
            out.print(i + ", ");
            out.println(UiConstants.UI_EMPTY_SPACE);

//Find the largest element of the array
        int maxIndex = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > firstArray[maxIndex]) {
                maxIndex = i;
            }
        }
        out.println(UiConstants.UI_EMPTY_SPACE);
        out.println(ProgramResultConstants.PROGRAM2_RESULT);
        out.println(UiConstants.UI_EMPTY_SPACE);
        out.println(firstArray[maxIndex]);
    }
}
