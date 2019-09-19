package ua.hillel;

import java.util.Scanner;
import static java.lang.System.out;
import ua.hillel.UiUtils.ChooseProgram;
import ua.hillel.UiUtils.UiConstants;

public class ScannerIn {

    public static void enterNumberOfTheProgram(){
        out.println(UiConstants.UI_CHOOSE_PROGRAM_NUMBER);
        Scanner pr = new Scanner(System.in);
        int choose = 0;


// check to enter a number from the keyboard, when typing a letter, it returns to the start of entering the program number
        if (pr.hasNextInt()){
            choose = pr.nextInt();
        }

       switch (choose) {
            case 1:
                Program01.say();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 2:
                Program02.say();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 3:
                Program03.say();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 4:
                Program04.fibonacci();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 5:
                Program05.say();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 6:
                Program06.factorial();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 7:
                Program07.say();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 8:
                Program08.changeLine();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;
            case 9:
                Program09.celsius();
                out.println(UiConstants.UI_DIVIDER_BLUE);
                ScannerSecondChoose.exitOrContinue();
                break;

            default:
                out.println(UiConstants.UI_WARNING_MESSAGE);
                out.println(UiConstants.UI_DEVIDER_RED);
                out.println(UiConstants.UI_NO_PROGRAM_MESSAGE);
                out.println(UiConstants.UI_DEVIDER_RED);
                enterNumberOfTheProgram();
        }
    }
}

class ScannerSecondChoose {

    public static void exitOrContinue(){
        out.println(UiConstants.UI_PRESS_TEXT);
        out.println(UiConstants.UI_CONTINUE_OR_EXIT);
        Scanner choose2 = new Scanner(System.in);
        int secondChoose = 0;

// check to enter a number from the keyboard, when typing a letter, it returns to the start of entering the program number
        if (choose2.hasNextInt()){
            secondChoose = choose2.nextInt();
        }

        switch (secondChoose) {
            case 1:
                ChooseProgram.chooseTheProgram();
                ScannerIn.enterNumberOfTheProgram();
                break;
            case 2:
                out.println(UiConstants.UI_DEVIDER_RED);
                out.println(UiConstants.UI_EXIT);
                out.println(UiConstants.UI_DEVIDER_RED);
                break;

            default:
                out.println(UiConstants.UI_WARNING_MESSAGE);
                out.println(UiConstants.UI_DEVIDER_RED);
                out.println(UiConstants.UI_CHOOSE_1_OR_2);
                out.println(UiConstants.UI_DEVIDER_RED);
            exitOrContinue();
        }
    }
}




