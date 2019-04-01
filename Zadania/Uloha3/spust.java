package Skola.Zadania.Uloha3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class spust {

    public static void main(String[] args) throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("vypisPole.txt")); //tento bufferedwriter je len na premazanie suboru
        Scanner sc = new Scanner(System.in);                                                 //aby sme nemali milion poli vypisanych v subore
        pole pole_a = new pole(4,4);
        pole_a.suborVstup();
        System.out.println("Zadaj ktory riadok chces zoradit");
        pole_a.zoradRiadok(sc.nextInt());       //zoradienie riadka a vypis pola
        pole_a.konzolaVypis();
        pole_a.suborVystup();
        System.out.println("Zadaj ktory stlpec chces zoradit");
        pole_a.zoradStplec(sc.nextInt());       //zoradienie stlpca a vypis pola
        pole_a.konzolaVypis();
        pole_a.suborVystup();
        System.out.println();
        pole_a.zoradHlavnuDiagonalu();          //zoradienie hlavnej diagonaly a vypis pola
        pole_a.konzolaVypis();
        pole_a.suborVystup();
        System.out.println();
        pole_a.zoradVedlajsiuDiagonalu();       //zoradienie vedlajsej diagonaly a vypis pola
        pole_a.konzolaVypis();
        pole_a.suborVystup();


    }

}
