package ua.hillel.UiUtils;

public class UiConstants {
    public static final String UI_DIVIDER_BLUE = (char) 27 + "[34m-----------------------------------------" + (char)27 + "[0m";
    public static final String UI_DEVIDER_RED = (char) 27 + "[31m-----------------------------------------" + (char)27 + "[0m";
    public static final String UI_EMPTY_SPACE = "       ";
    public static final String UI_CHOOSE_PROGRAM_BLUE = (char) 27 + "[34m    Выберите программу для запуска: " + (char)27 + "[0m";
    public static final String UI_CHOOSE_PROGRAM_NUMBER = (char) 27 + "[34m     Введите номер программы 1-9: " + (char)27 + "[0m";

    //programs titles
    public static final String UI_PROGRAMME_1 = "1. Сумма двух чисел";
    public static final String UI_PROGRAMME_2 = "2. Наибольшее целое число в списке";
    public static final String UI_PROGRAMME_3 = "3. Возврат n-го элемента списка";
    public static final String UI_PROGRAMME_4 = "4. Возрат n-го элемента последовательности Фибоначчи";
    public static final String UI_PROGRAMME_5 = "5. Палиндром";
    public static final String UI_PROGRAMME_6 = "6. Вычисление факториала заданного числа";
    public static final String UI_PROGRAMME_7 = "7. Возврат индекса первого вхождения заданного числа в список";
    public static final String UI_PROGRAMME_8 = "8. Метод измененния строки";
    public static final String UI_PROGRAMME_9 = "9. Преобразование градусов Цельсия в Фаренгейт";

    //navigation titles
    public static final String UI_PRESS_TEXT = (char) 27 + "[34m------------------PRESS------------------" + (char)27 + "[0m";
    public static final String UI_CONTINUE_OR_EXIT = (char) 27 + "[34m 1. Continue ------ or ------ 2. EXIT " + (char)27 + "[0m";

    //error titles
    public static final String UI_METHOD_NOT_IMPLEMENTED = (char) 27 + "[31mМы работаем над задачей в поте лица" + (char)27 + "[0m";
    public static final String UI_WARNING_MESSAGE = (char) 27 + "[31m                WARNING!" + (char)27 + "[0m";
    public static final String UI_INTEGER_MESSAGE = (char) 27 + "[31m          Введите целое число!!!" + (char)27 + "[0m";
    public static final String UI_NEGATIVE_NUMBER_WARNING = (char) 27 + "[31mВы ввели отрицательное число, для него вычислить факториал невозможно, попробуйте еще раз." + (char) 27 + "[0m";
    public static final String UI_NO_PROGRAM_MESSAGE = (char) 27 + "[31m    Вы вызвали несуществующую программу" + (char)27 + "[0m";
    public static final String UI_CHOOSE_1_OR_2 = (char) 27 + "[31m             Enter 1 or 2" + (char)27 + "[0m";
    public static final String UI_EXIT = (char) 27 + "[31m                   EXIT " + (char)27 + "[0m";
}