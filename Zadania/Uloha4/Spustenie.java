package Skola.Zadania.Uloha4;

import java.io.*;

public class Spustenie {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("D:\\ziaci.txt"));
            int pocetziakov = 0;
            while(br.readLine() != null){
                pocetziakov ++;
            }
            br.close();
            Ziaci SA = new Ziaci(pocetziakov);
            SA.nacitanie();
            SA.AP();
            SA.usporiadanie();
            SA.vypis();
        }
}
