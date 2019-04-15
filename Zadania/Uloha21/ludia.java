package Uloha_21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ludia {

    private Map<String, Integer> a = new TreeMap<String, Integer>();

    public ludia(){

    }
    public void vstup() throws IOException {
        BufferedReader in =  new BufferedReader(new FileReader("ludia.txt"));
        String pomoc;
        String vstup[];
        while (!((pomoc = in.readLine()) == null)) {
            vstup = pomoc.split(" ");
            a.put(vstup[0] + " " + vstup[1], Integer.parseInt(vstup[2]));
        }
    }

    public void pridaj(String[] vstup){
        a.put(vstup[0] + " " + vstup[1], Integer.parseInt(vstup[2]));
    }

    public void odstran(String vstup){
        a.remove(vstup);
    }

    public void AP(){
        int spolu = 0;
        int pocet = 0;
        for (String key : a.keySet()){
            spolu += a.get(key);
            pocet++;
        }
        double ap = (double) spolu / pocet;
        System.out.println("Priemer: " + ap);
        System.out.println("Ludia s platom vascim ako priemer: ");
        for (String key : a.keySet()){
            if (a.get(key) > ap){
                System.out.println(key);
            }
        }
    }

    public void vypis(){
        for (String key : a.keySet()) {
            System.out.println(key + " " + a.get(key));
        }
    }

}
