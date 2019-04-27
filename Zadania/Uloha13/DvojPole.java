package Uloha14;

import java.io.*;
import java.util.Arrays;

public class DvojPole {
    private int[][] dPole1,dPole2;
    public int[][] getdPole1() { return dPole1; }
    public int[][] getdPole2() { return dPole2; }
    public int[] getRiadok(int[][] pole,int i)  { return pole[i]; }

    public DvojPole(int a, int b) throws IOException {
        this.dPole1=new int[a][b];
        this.dPole2=new int[a][b];
        BufferedReader read=new BufferedReader(new FileReader("D:\\ipole.txt"));
        for (int i = 0; i < dPole1.length; i++) {
            String []riadok=read.readLine().split(" ");
            dPole1[i]=new int[riadok.length];
            dPole2[i]=new int[riadok.length];
            for (int j = 0; j < riadok.length; j++) {
                dPole1[i][j]=Integer.parseInt(riadok[j]);
                dPole2[i][j]=Integer.parseInt(riadok[j]);
            }
        }
        read.close();
    }
    public void zorad(int row){
        row--;
        Arrays.sort(dPole1[row]);
        Arrays.sort(dPole2[row]);
    }

    public void pis(int [][]pole) throws IOException{
        BufferedWriter write=new BufferedWriter(new FileWriter("D:\\vpole.txt",true));
        for (int i = 0; i < pole.length; i++) {
            String riadok="";
            for (int j = 0; j < pole.length; j++) {
                riadok=riadok+" "+pole[i][j];
            }
            write.write(riadok);
            write.newLine();
        }
        write.newLine();
        write.close();
    }
    public void porovnaj(int[] riadok1, int[] riadok2){
        int a=0;
        for (int i = 0; i < riadok1.length-1; i++) {
            if (riadok1[i]!=riadok2[i]){a++;break;}
        }
        if (a==0) System.out.println("Riadky sa zhoduju");
        else System.out.println("Riadky sa nezhoduju");
    }
    public float apHlavnej(int[][] pole){
        float ap= 0.0f;
        for (int i = 0; i < pole.length; i++) {
            ap = ap+ (float) pole[i][i];
        }

        return ap/(float) (pole.length);
    }
    public float apVedlajsej(int[][] pole){
        float ap= 0.0f;
        for (int i = 0; i < pole.length; i++) {
            ap = ap + (float) pole[i][pole.length-1-i];
        }
        return (ap/(float)(pole.length));
    }
}

