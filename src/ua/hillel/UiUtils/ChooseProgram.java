package ua.hillel.UiUtils;

import ua.hillel.UiUtils.UiConstants;

import static java.lang.System.out;

public class ChooseProgram {
    // FIXME: 1/24/18 need to rename class to more readable and intuitive name, According to responsibility of this class.

    public static void Choose(){ // FIXME: 2/8/18 CodeConvention Capital latter!
        out.println(UiConstants.UI_DIVIDER_BLUE);

        out.println(UiConstants.UI_CHOOSE_PROGRAM_BLUE);

        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_1);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_2);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_3);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_4);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_5);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_6);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_7);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_8);
        out.println(UiConstants.UI_EMPTY_SPACE + UiConstants.UI_PROGRAMME_9);

        out.println(UiConstants.UI_DIVIDER_BLUE);
    }
}
