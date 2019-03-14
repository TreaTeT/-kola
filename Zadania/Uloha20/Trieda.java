package Skola.Zadania.Uloha20;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Trieda{
    private Set<String> set = new TreeSet<String>(); //kolekcia set ktora automaticky zoraduje
    private int pocet1; // pocet mien od a-j
    private int pocet2; //pocet mien od k-z

    public Trieda() {

    }

    public void nacitaj() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("mena.txt"));
        String line; //riadok
        while((line = in.readLine())!=null){  //pokial neprecitam prazny riadok
           this.set.add(line); //pridavam riadok (meno) do setu
        }
        in.close();
    }

    public void vypis() throws IOException{
        BufferedWriter out  = new BufferedWriter(new FileWriter("vysledok.txt"));
        for(String line : set){//vypisujem do subporu zoradene mena
            out.write(line);
            out.newLine();
        }
        //vypisujem pocet a-j a k-z
        out.write("Pocet mien od a-j je " + this.pocet1);
        out.newLine();
        out.write("Pocet mien od k-z je " + this.pocet2);
        out.close();
    }

    public void pocitaj(){ //pocitanie mien od a-j a k-z
        for(String line : set){ //prejdem loopom cez set
            line = line.trim(); //riadok (meno)
            char firstchar = Character.toLowerCase(line.charAt(0)); //prve pismeno v mene dam do lowercase
            if(firstchar <=  'j'){ //ak je mensie alebo rovne ako j
                this.pocet1 ++; //pripocitam +1 k poctu mien od a-j
            }else{
                this.pocet2 ++;//pripocitam +1 k poctu mien od a-j
            }
        }
    }



}
