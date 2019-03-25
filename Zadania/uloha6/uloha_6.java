package Skola.Zadania.uloha6;
import java.util.Random;

public class uloha_6 {


    static float[] pole = new float[15];

    static void napln(){        //zaplnenie pola cislami v intervale <2; 32>
        Random x = new Random();
        for (int i = 0; i < 15; i++){
            pole[i] = 2 + x.nextFloat() * (33 - 2);
        }
    }

    static void info(){
        System.out.print("Hmotnosti: ");
        for (int i = 0; i < 15; i++){
            System.out.printf("%.2f ", pole[i]);   //vypis zo zaokruhlenim na 2 desatinne cisla
        }
        System.out.println();

    }
    static void spolu(){
        float spolu = 0;
        for (int i = 0; i < 15; i++){
            spolu += pole[i];           //scitanie
        }
        System.out.printf("Celková hmotnosť: %.3f \n", spolu);    //vypis zo zaokruhlenim na 3 desatinne cisla

    }

    static void lahke(){
        int n = 0;
        for (int i = 0; i < 15; i++){
            if (pole[i] < 12){              //zistenie ktore cisla su do 12
                if (n == 0)
                    System.out.print("Hmotnosti do 12kg: ");    //v prvom cykle vypise
                System.out.printf("%.1f ", pole[i]);           //vypis zo zaokruhlenim na 1 desatinne cislo
                n++;
            }
        }
        System.out.println();
        System.out.print("Počet baikov pod 12kg: " + n);
    }


    public static void main(String[] args) {
        napln();
        info();
        spolu();
        lahke();
    }

}
