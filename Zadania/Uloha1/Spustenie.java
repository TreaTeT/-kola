package Skola.Zadania.Uloha1;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Spustenie {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Riadky:");
        int r=sc.nextInt();
        System.out.println("Stlpce:");
        int s=sc.nextInt();
        Hladanie x = new Hladanie(r,s);
        x.nacitanieK();
        x.nacitanieS();
        x.Max();
        System.out.println("Max do suboru");
        x.vypisS(sc.nextInt(),sc.nextInt());
        System.out.println("Max v riadkoch a stlpcoch");
        x.maR(r);
        x.maS(s);
        x.vMaxR(sc.nextInt());
        x.vMaxS(sc.nextInt());

    }
}
