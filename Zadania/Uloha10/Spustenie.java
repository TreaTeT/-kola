package Uloha10;

import java.io.IOException;

public class Spustenie {
    public static void main(String[] args) throws IOException {
        Filmy a=new Filmy();
        a.nacitaj();
        a.quicksort(0,10);
        a.vypis();
        a.komunikuj();
    }
}


