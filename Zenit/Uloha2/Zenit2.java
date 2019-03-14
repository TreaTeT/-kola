package Skola.Zenit.Uloha2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zenit2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine()); // nacitam a parsnem to na int
        while (N >= 1) {
            if (N == 1) { // ak je cislo 1 sout ano
                System.out.println("ano");
                break;
            }
            if (N % 2 != 0) { // ak je cislo po deleni dvomi neparne znamena to ze uz nikdy z toho nedostanem 1
                System.out.println("nie");
                break;
            }
            N=N/2; //delim cislo
        }
    }
    // riesenie 2 :  System.out.println((N & (N - 1)) == 0 ? "ano" : "nie"); <--- toto je lepsie ale aj tak neprejde
    // ak chcete vysvetlenie k rieseniu 2 hmu


    /*Uloha este stale nie je dokoncena ale ja fakt neviem co s tym uz
    riesia to obe profesorky takze ked tak to updatnem potom*/
    
    //sub 2 pewds
}
