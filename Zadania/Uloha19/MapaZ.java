package Uloha19;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapaZ {
    private Map<Integer, Zamestnanci> zoznam_zamestnancov = new TreeMap<Integer, Zamestnanci>();
    MapaZ() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D:\\zamestnanci.txt"));
        String line;
        while ((line = in.readLine())!= null){
            String [] pole = line.split(" ");
            Zamestnanci osoba = new Zamestnanci(Integer.parseInt(pole[0]), pole[1], pole[2], Integer.parseInt(pole[3]));
            zoznam_zamestnancov.put(osoba.getEvidencne_cislo(), osoba);
        }
    }
        public void pridaj(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj EC, meno, priezvisko a vek zamestnanca.");
        String [] pomoc = sc.nextLine().split(" ");
        if(zoznam_zamestnancov.get(Integer.parseInt(pomoc[0]))==null) {
            Zamestnanci osoba = new Zamestnanci(Integer.parseInt(pomoc[0]), pomoc[1], pomoc[2], Integer.parseInt(pomoc[3]));
            zoznam_zamestnancov.put(osoba.getEvidencne_cislo(), osoba);
        }
        else {
            System.out.println("Toto EC je uz zabrane.");
        }
    }

    public void odstran(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj EC zamestnanca.");
        zoznam_zamestnancov.remove(sc.nextInt());
    }
    public void vypis(){
        for (Integer key: zoznam_zamestnancov.keySet()){
            System.out.println(zoznam_zamestnancov.get(key).getEvidencne_cislo()+" "+zoznam_zamestnancov.get(key).getMeno()+" "+zoznam_zamestnancov.get(key).getPriezvisko()+" "+zoznam_zamestnancov.get(key).getVek());
        }
    }

    public double APVek(){
        double sucet =0;
        int pocet =zoznam_zamestnancov.size();
        for (Integer key : zoznam_zamestnancov.keySet()) {
            sucet+=zoznam_zamestnancov.get(key).getVek();
        }
        return (sucet/pocet);
    }

    public void InfoVek(){
        for (Integer key: zoznam_zamestnancov.keySet()){
            if(zoznam_zamestnancov.get(key).getVek()>APVek()){
                System.out.println(zoznam_zamestnancov.get(key).getEvidencne_cislo()+" "+zoznam_zamestnancov.get(key).getMeno()+" "+zoznam_zamestnancov.get(key).getPriezvisko()+" "+zoznam_zamestnancov.get(key).getVek());
            }
        }
    }

    public void koniec() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter("D:\\zamestnanci.txt"));
        for (Integer key: zoznam_zamestnancov.keySet()){
            out.write(zoznam_zamestnancov.get(key).getEvidencne_cislo()+" "+zoznam_zamestnancov.get(key).getMeno()+" "+zoznam_zamestnancov.get(key).getPriezvisko()+" "+zoznam_zamestnancov.get(key).getVek());
            out.newLine();
        }
        out.close();
        System.exit(0);
    }

}
