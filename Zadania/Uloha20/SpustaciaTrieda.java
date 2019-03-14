package Skola.Zadania.Uloha20;

import java.io.IOException;

public class SpustaciaTrieda {
    public static void main(String[] args) throws IOException {
        Trieda a = new Trieda(); //konstruktor
        a.nacitaj(); //nacitam mena zo suboru
        a.pocitaj(); //pocitam mena od a-j a k-z
        a.vypis(); //vypisem do suboru

    }
}
