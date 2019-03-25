package Uloha1;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Hladanie {

        private int Pole[][];
        private int maxR[];
        private int maxS[];

        public Hladanie(int r, int s){
            this.Pole = new int[r][s];
            this.maxR = new int[r];
            this.maxS = new int[s];
        }


   public void nacitanieS() throws IOException {
            BufferedReader in=new BufferedReader(new FileReader("D:\\HladanieI.txt"));
       String pomoc;
       String[] rozdelenie;
       int k=0;

       while ((pomoc=in.readLine())!=null){
           rozdelenie=pomoc.split(" ");
           for (int i = 0; i < rozdelenie.length; i++) {
               this.Pole[k][i]=Integer.parseInt(rozdelenie[i]);
           }
           k++;
       }

   }
        public void nacitanieK(){
            Scanner sc=new Scanner(System.in);
            for (int i = 0; i < Pole.length; i++) {
            for (int j = 0; j < Pole[i].length; j++) {
                System.out.println("Zadaj cislo do pola");
                Pole[i][j] =sc.nextInt();

            }

        }
            for (int i = 0; i < Pole.length; i++) {
                for (int j = 0; j <Pole[i].length ; j++) {
                    System.out.print(Pole[i][j] + " ");
                }
                System.out.println();
            }
         System.out.println();


        }
        public void Max(){
            for (int i = 0; i < Pole.length; i++) {
                for (int j = 0; j < Pole[i].length; j++) {
                    if (Pole[i][j] > maxR[i]) {
                        maxR[i] = Pole[i][j];
                    }
                    if (Pole[i][j] > maxS[j]) {
                        maxS[j] = Pole[i][j];
                    }
                }
            }
        }
        public void maR(int r){

            for (int i = 0; i <r ; i++) {
                System.out.print(maxR[i]+" ");
            }
            System.out.println();
        }

        public void maS(int s) {
                for (int i = 0; i < s; i++) {
                System.out.print(maxS[i] + " ");
            }
            System.out.println();
        }
        public void vMaxR(int k){
            System.out.println("Maximum z i-teho riadka");
            System.out.println(maxR[k]);
            System.out.println();
        }

         public void vMaxS(int k){
             System.out.println("Maximum z j-teho stlpca");
             System.out.println(maxS[k]);
             System.out.println();
        }

        public void vypisS(int k, int l)throws IOException{
            BufferedWriter out=new BufferedWriter(new FileWriter("D:\\HladanieO.txt"));
            String me="";
            for (int i=0;i<this.Pole.length;i++){
                for (int j=0;j<this.Pole[i].length;j++){
                    out.write(this.Pole[i][j]+" ");
                }
                out.write("\n");
            }


            out.write("Maximum z i-teho riadka");
            out.write(me+maxR[k]);
            out.newLine();

            out.write("Maximum z j-teho stlpca");
            out.write(me +maxS[l]);
            out.close();


        }
}

