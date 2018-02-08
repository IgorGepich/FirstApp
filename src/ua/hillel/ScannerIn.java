package ua.hillel;

import java.util.Scanner;

import static java.lang.System.out;

import ua.hillel.UiUtils.ChooseProgram;
import ua.hillel.UiUtils.UiConstants;

public class ScannerIn {

    public static void EnterNumberOfTheProgram(){
        out.println((char) 27 + "[34m     Введите номер программы 1-9: " + (char)27 + "[0m");
        Scanner pr = new Scanner(System.in);
        int choose = 0;

        // проверка на ввод числа с клавиатуры, при вводе буквы возвращает на старт ввода номера программы
        if (pr.hasNextInt()){
            choose = pr.nextInt();
        }


       switch (choose) {
            case 1:
                Program01.Say();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 2:
                Program02.Say();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 3:
                Program03.Say();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 4:
                Program04.Fibonacci();
                out.println("\n" + (char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 5:
                Program05.Say();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 6:
                Program06.Factorial();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 7:
                Program07.Say();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 8:
                Program08.ChangeLine();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;
            case 9:
                Program09.Celsius();
                out.println((char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m");
                ScannerSecondChoose.ExitOrContinue();
                break;

            default:
                out.println((char) 27 + "[31m                WARNING!" + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
                out.println((char) 27 + "[31m    Вы вызвали несуществующую программу" + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");

                EnterNumberOfTheProgram();
        }
    }
}

class ScannerSecondChoose {

    public static void ExitOrContinue(){
        out.println(UiConstants.UI_PRESS_TEXT);
        out.println(UiConstants.UI_CONTINUE_OR_EXIT);
        Scanner choose = new Scanner(System.in);
        int secondChoose = 0;

        // проверка на ввод числа с клавиатуры, при вводе буквы возвращает на старт ввода номера программы
        // FIXME: 2/8/18 need to use an english ONLY.
        if (choose.hasNextInt()){
            secondChoose = choose.nextInt();
        }

        switch (secondChoose) {
            case 1:
                ChooseProgram.Choose();
                ScannerIn.EnterNumberOfTheProgram();
                break;
            case 2:
                // TODO: 2/8/18 use a Constants for strings.
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
                out.println((char) 27 + "[31m                   EXIT " + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
                break;

            default:
                out.println((char) 27 + "[31m                WARNING!" + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");
                out.println((char) 27 + "[31m             Enter 1 or 2" + (char)27 + "[0m");
                out.println((char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m");

            ExitOrContinue();
        }
    }
}




