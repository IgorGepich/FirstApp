package ua.hillel;

import static java.lang.System.out;
import java.util.Scanner;

public class Program06 {

    public static void Factorial() {
        long n;
        do
        {
            Scanner scan = new Scanner(System.in);
            out.println((char) 27 + "[34mВведите натуральноe число для вычисления факториала в диапазоне от 1 до 65: " + (char)27 + "[0m");
            n = scan.nextInt();
            if(n < 0)
                out.println((char) 27 + "[31mВы ввели отрицательное число, для него вычислить факториал невозможно, попробуйте еще раз." + (char) 27 + "[0m");
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
                        out.println(n+"!  = "+result);
                    }
                }
            }
        } while (n < 0);
    }
}