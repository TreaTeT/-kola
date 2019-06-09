package Uloha19;

import java.io.*;
import java.util.Scanner;

public class Zamestnanci_PSVM {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        MapaZ zamestnanci = new MapaZ();

        while (true){

            System.out.println();
            System.out.println("0 = pridat noveho zamestnanca");
            System.out.println("1 = odstranit zamestnanca");
            System.out.println("2 = vypis udajov zamestnancov");
            System.out.println("3 = vypise priemerny vek zamestnancov");
            System.out.println("4 = vypise meno a priezvisko zamestnancov starsich ako priemerny vek");
            System.out.println("5 = ulozenie a skoncenie programu");
            int a = sc.nextInt();

            while (a>5||a<0){
                System.out.println("Zadal si neplatnu moznost");
                a = sc.nextInt();
            }
            sc.nextLine();
            if(a==0){
                zamestnanci.pridaj();
            }
            else if(a==1){
                zamestnanci.odstran();
            }
            else if(a==2){
                zamestnanci.vypis();
            }
            else if(a==3) {
                System.out.println(zamestnanci.APVek());
            }
            else if(a==4){
                zamestnanci.InfoVek();
            }
            else {
                zamestnanci.koniec();
            }

        }

    }

}
