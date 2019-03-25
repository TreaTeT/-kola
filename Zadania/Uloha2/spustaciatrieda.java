package Skola.Zadania.Uloha2;

import java.io.IOException;

public class spustaciatrieda {
    public static void main(String[] args) throws IOException {
        Pole a = new Pole(4,4);
        //a.klavesnica(); nacitanie z klavesnice
        //a.najdi('a'); najdenie zadaneho charu v poli
        a.subor(); //nacitanie zo suboru
        a.vymenRiadky(1,2); //vymenenie riadkov
        a.vymenStlpce(1,2); //vymenenie stlpcov
        System.out.println();
        a.vypis(); //vypis na konzolu
        a.zapis(); //zapis do suboru

    }
}
