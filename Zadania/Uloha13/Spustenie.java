package Uloha14;

import java.io.IOException;
import java.util.Scanner;

public class Spustenie {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        DvojPole a=new DvojPole(5,5);
        a.pis(a.getdPole1());
        a.pis(a.getdPole2());
        a.zorad(2);
        int vstup,r1,r2,vstup2;
        do {
            System.out.println("Chces porovnat riadky jedneho pola(zadaj 1) alebo dvoch rozdnych poli(zadaj 2)");
            vstup=sc.nextInt();
        }while (vstup<1 || vstup>2);
        if (vstup==1){
            do {
                System.out.println("Zadaj ktore pole(1 alebo 2)");
                vstup2=sc.nextInt();
            }while (vstup2<1 || vstup2>2);
            do {
                System.out.println("Zadaj 1.riadok");
                r1=sc.nextInt();
                System.out.println("Zadaj 2.riadok");
                r2=sc.nextInt();
            }while (r1<0 || r1>6 && r2<0 || r2>6);
            r1--;r2--;
            if (vstup2==1) a.porovnaj(a.getRiadok(a.getdPole1(),r1),a.getRiadok(a.getdPole1(),r2));
            else a.porovnaj(a.getRiadok(a.getdPole2(),r1),a.getRiadok(a.getdPole2(),r2));
        }else {
            do {
                System.out.println("Zadaj riadok z 1. pola");
                r1=sc.nextInt();
                System.out.println("Zadaj riadok z 2. pola");
                r2=sc.nextInt();
            }while (r1<0 || r1>6 && r2<0 || r2>6);
            r1--;r2--;
            a.porovnaj(a.getRiadok(a.getdPole1(),r1),a.getRiadok(a.getdPole2(),r2));
        }
        System.out.println("ap hlavnej 1. pola "+a.apHlavnej(a.getdPole1()));
        System.out.println("ap hlavnej 2. pola "+a.apHlavnej(a.getdPole2()));
        System.out.println("ap vedlajsej 1. pola "+a.apVedlajsej(a.getdPole1()));
        System.out.println("ap vedlajsej 2. pola "+a.apVedlajsej(a.getdPole2()));
        a.pis(a.getdPole1());
        a.pis(a.getdPole2());
    }
}