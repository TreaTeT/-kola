package Uloha_6;

import java.util.Random;

public class posta {

    private float[] pole = new float[15];

    public posta(){

    }

    public void napln(){        //zaplnenie pola cislami v intervale <2; 32>
        Random x = new Random();
        for (int i = 0; i < 15; i++){
            this.pole[i] = 2 + x.nextFloat() * (33 - 2);
        }
    }
    public void info(){
        System.out.print("Hmotnosti: ");
        for (int i = 0; i < 15; i++){
            System.out.printf("%.2f ", pole[i]);   //vypis zo zaokruhlenim na 2 desatinne cisla
        }
        System.out.println();

    }

    public void spolu(){
        float spolu = 0;
        for (int i = 0; i < 15; i++){
            spolu += pole[i];           //scitanie
        }
        System.out.printf("Celková hmotnosť: %.3f ", spolu);    //vypis zo zaokruhlenim na 3 desatinne cisla

    }
    public void lahke(){
        int n = 0;
        for (int i = 0; i < 15; i++){
            if (pole[i] < 12){              //zistenie ktore cisla su do 12
                if (n == 0)
                    System.out.print("\nHmotnosti do 12kg: ");    //v prvom cykle vypise
                System.out.printf("%.1f ", pole[i]);           //vypis zo zaokruhlenim na 1 desatinne cislo
                n++;
            }
        }
        System.out.println();
        System.out.print("Počet baikov pod 12kg: " + n);
    }

    /* ak toto citas tak mas velke pp */

}
