package Skola.Zadania.Uloha14;

import java.io.IOException;

public class SpustaciaTrieda {
    public static void main(String[] args) throws IOException {
        Retazec a = new Retazec();
        a.nacitajSubor(); //nacitanie suboru
        System.out.print(a.daj(3)); //vypise znak na danej pozicii
        a.zmen(0, 'K'); //zmeni znak na danej pozicii za dany znak
        System.out.println(a.pocet()); //vypise pocet slov
        System.out.println(a.najvacsiZnak()); //najdenie znaku najdalej v abecede
        System.out.println(a.pocetSamohlasok()); // pocitanie samohlasok
        System.out.println(a.pocetSpoluhlasok()); //pocitanie spoluhlasok
        a.zakoduj(2); // zakodovanie
        a.odkoduj(2); // dekodovanie
        a.vypisSubor(); //vypis do suboru
    }
}
