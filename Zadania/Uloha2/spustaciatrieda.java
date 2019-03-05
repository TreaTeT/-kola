package Uloha2;

import java.io.IOException;

public class spustaciatrieda {
    public static void main(String[] args) throws IOException {
        Pole a = new Pole(4,4);
        //a.klavesnica();
        //a.najdi('a');
        a.subor();
       // a.vymenRiadky(1,2);
       // a.vypis();
        a.vymenStlpce(1,2);
        System.out.println();
        a.vypis();
        a.zapis();

    }
}
