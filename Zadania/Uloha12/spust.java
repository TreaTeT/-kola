package Uloha_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class spust {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("pretekyVstup.txt"));
        Map<Double, String> mapa = new TreeMap<Double, String>();
        String meno = "";
        for (int i = 0; i < 10; i++) {
            meno = in.readLine();
            pretekar a = new pretekar(in.readLine());
            a.vstup();
            mapa.put(a.priemer(), meno);

        }
        for (Map.Entry<Double, String> entry : mapa.entrySet() ){
            System.out.println(entry.getValue());
        }
        in.close();
    }

}
