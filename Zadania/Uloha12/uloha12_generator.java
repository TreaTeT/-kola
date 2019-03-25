package Skola.Zadania.Uloha12;

import java.util.Locale;
import java.util.Random;

public class uloha12_generator {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random x = new Random();
        for (int i = 0; i < 10; i++){
            System.out.println("meno" + (i + 1) + " priezvisko" + (i + 1));
            for (int j = 0; j < 10; j++){
                double a = (1 + (10 - 1) * x.nextDouble());
                System.out.printf("%.1f " ,a);
            }
            System.out.println();

        }

    }

}
