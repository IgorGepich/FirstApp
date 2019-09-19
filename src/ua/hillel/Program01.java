package ua.hillel;

import ua.hillel.UiUtils.UiConstants;
import ua.hillel.UiUtils.ProgramNameConstants;
import ua.hillel.UiUtils.UserEnterConstants;
import ua.hillel.UiUtils.ProgramResultConstants;

import java.util.Scanner;

import static java.lang.System.out;

public class Program01 {

    public static void say(){
        out.println(UiConstants.UI_DIVIDER_BLUE);
        out.println(ProgramNameConstants.PROGRAM1_NAME);
        out.println(UiConstants.UI_EMPTY_SPACE);

        double soundSpeed = 1191.6;
        double distance;
        double distanceKm;
        Scanner scanner = new Scanner(System.in);
        out.print("Enter time before the lightning: ");
        int enterTime = scanner.nextInt();
        distance = soundSpeed * enterTime; // result DISTANCE in meters
        distanceKm = distance / 1000; // // result DISTANCE in km

        out.println(UiConstants.UI_EMPTY_SPACE);
        out.println(ProgramResultConstants.PROGRAM_01_RESULT);
        out.println(UiConstants.UI_EMPTY_SPACE);
        out.printf("%.0f meters or\n", distance);
        out.printf("%.1f km\n", distanceKm);
        //out.println(distanceKm + " km.");
        //out.printf("Расстояние до молнии: %.0f метров", distance); // Вывод 0 знаков после зяпятой
        //out.println("Distance to the lightning: " + distance); // Вывод ВСЕХ знаков после зяпятой
    }
}
