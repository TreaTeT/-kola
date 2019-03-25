package Skola.Zadania.Uloha12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class spustacka {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("pretekyVstup.txt"));
        Map<Double, String> mapa = new TreeMap<Double, String>();
        String meno = "";
        for (int i = 0; i < 10; i++) {
            meno = in.readLine();
            krasokorculiar a = new krasokorculiar(in.readLine());
            a.vstup();
            mapa.put(a.priemer(), meno);

        }
        for (Map.Entry<Double, String> entry : mapa.entrySet() ){
            System.out.println(entry.getValue());
        }
        in.close();
    }

}
