package ua.hillel;

import java.util.Random;

import static java.lang.System.out;

public class Program02 {

    public static void Say(){

        out.println((char) 27 + "[34mПрограмма создает массив размером n и заполняет его рандомными числами в диапазоне от 0 до 99" + (char)27 + "[0m");
        int[] firstArray = new int[40];//Создаем массив размером n
        Random rand = new Random();

        for (int i = 0; i < firstArray.length; i++)
            firstArray[i] = rand.nextInt(100); // Заполняем массив случайными числами диапазона [0...99]
        for (int i : firstArray)
            out.print(i + ", "); // Выводим на экран массив

        // Находим наибольший элемент массива
        int maxIndex = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] > firstArray[maxIndex]) {
                maxIndex = i;
            }
        }
        out.println("\n");
        out.println((char) 27 + "[32m      Наибольший элемент массива: " + (char)27 + "[0m");
        out.println(firstArray[maxIndex]);
    }
}
