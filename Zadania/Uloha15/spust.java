package Uloha_15;

import java.util.Scanner;

public class spust {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cas a = new Cas();
        System.out.println("Zadaj hodiny");
        a.nastavHodiny(sc.nextInt());
        System.out.println("Zadaj minuty");
        a.nastavMinuty(sc.nextInt());
        System.out.println("Zadaj sekundy");
        a.nastavSekundy(sc.nextInt());
        System.out.println("Cas");
        System.out.println(a.zostavInfo());
    }

}
