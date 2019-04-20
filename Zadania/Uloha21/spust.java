package Uloha_21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class spust {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ludia a = new ludia();
        a.vstup();
        while (true){
            System.out.println("Zadaj co chces robit");
            System.out.println("1 - Pridaj cloveka");
            System.out.println("2 - Odstran cloveka");
            System.out.println("3 - Vypis evidovanych ludi");
            System.out.println("4 - Vypis priemerneho platu");
            System.out.println("5 - Koniec");
            int zadavanie = sc.nextInt();
            if (zadavanie == 5)
                break;
            if (zadavanie == 1){
                System.out.println("Zadaj meno + priezvisko + plat");
                sc.nextLine();
                a.pridaj(sc.nextLine().split(" "));
            }
            if (zadavanie == 2){
                System.out.println("Zadaj meno + priezvisko cloveka ktoreho chces odstranit");
                sc.nextLine();
                a.odstran(sc.nextLine());

            }
            if (zadavanie == 3){
                a.vypis();
            }
            if (zadavanie == 4){
                a.AP();
            }
        }

    }

}
