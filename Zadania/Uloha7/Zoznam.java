package Skola.Zadania.Uloha7;

import java.io.*;

public class Zoznam {
    private String [] A;

    public void citaj() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\udajeC.txt"));
        A = br.readLine().split(" ");
    }
    public boolean jeToMuz(String cislo){
        if(Integer.parseInt(cislo.substring(2,4))-50 > 0)
            return false;
        else
            return true;
    }
    public String vypocet(){
        int muzi = 0;
        int zeny = 0;
        for(int i=0; i<A.length; i++){
            if(jeToMuz(A[i]) == true)
                muzi ++;
            else
                zeny ++;
        }
        return "Pocet muzov: "+muzi+" Pocet zien: "+zeny;
    }
    public void vypis() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\vystupC.txt"));
        bw.write(vypocet());
        bw.close();
        System.out.println("Hotovo");
    }

}

