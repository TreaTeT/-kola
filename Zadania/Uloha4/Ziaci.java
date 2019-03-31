package Uloha4;

import java.io.*;

public class Ziaci {
    private String [][] ziaci;

    public Ziaci(int pocetriadkov){
        ziaci = new String[pocetriadkov][];
    }
    public void nacitanie() throws IOException { //tu si to napohodku nacitas zo suboru kde na zaciatku mas pocet ziakov a potom ich priemery
        BufferedReader br = new BufferedReader(new FileReader("D:\\ziacI.txt"));
        for(int i=0; i<ziaci.length; i++){
            String[] pomoc = br.readLine().split(" ");
            ziaci[i] = new String[pomoc.length+1];
            for(int j=0; j<pomoc.length; j++)
                ziaci[i][j] = pomoc[j];
        }
    }
    public void AP(){
        for(int i=0; i<ziaci.length; i++){
            int sucet = 0;
            for(int j=1; j<ziaci[i].length-1; j++)
                sucet += Integer.parseInt(ziaci[i][j]);
            ziaci[i][ziaci[i].length-1] = Double.toString((double) sucet/(ziaci[i].length-2));
        }
    }
    public void usporiadanie(){
        for(int i=0; i<ziaci.length-1; i++){
            int j = i+1;
            String[] tmp = ziaci[j];
            while(j>0 && tmp[tmp.length-1].compareTo(ziaci[j-1][ziaci[j-1].length-1]) < 0){
                ziaci[j] = ziaci[j-1];
                j--;
            }
            ziaci[j] = tmp;
        }
        for(int i=0; i<ziaci.length; i++){
            for(int j=0; j<ziaci[i].length; j++){
                System.out.print(ziaci[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void vypis() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\vysledky.txt"));
        for(int i=0; i<ziaci.length; i++){
            bw.write(ziaci[i][0]+" AP: "+ziaci[i][ziaci[i].length-1]);
            bw.newLine();
        }
        bw.close();
    }


}

