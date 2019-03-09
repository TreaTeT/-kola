package Uloha_3;

import java.io.*;
import java.util.Scanner;

public class pole {

    private int stlpce;
    private int riadky;
    private String[][] B;

    public pole(int riadky, int stlpce){ //konstruktor
        this.B = new String[riadky][stlpce];
        this.riadky = riadky;
        this.stlpce = stlpce;
    }

    public void konzolaVstup(){         //nacitanie pola pomocou klavesnice
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadavaj do pola");
        for (int i = 0; i < this.B.length; i++){
            for (int j = 0; j < this.B[i].length; i++){
                this.B[i][j] = sc.nextLine();
            }
        }
    }
    public void konzolaVypis(){     //vypis pola na konzolu
        for(int i = 0 ; i < this.B.length; i++){
            for(int j = 0 ; j < this.B[i].length;j++){
                System.out.print(this.B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void suborVstup() throws IOException {   //nacitanie pola pomocou suboru
        BufferedReader input = new BufferedReader(new FileReader("vstupPole.txt"));
        for (int i = 0; i < this.riadky; i++){
                this.B[i] = input.readLine().split(" ");
        }
        input.close();
    }
    public void suborVystup() throws IOException {  //vypis pola do suboru
        BufferedWriter output = new BufferedWriter(new FileWriter("vypisPole.txt", true));
        for (int i = 0; i < this.riadky; i++){
            for (int j = 0; j < this.stlpce; j++){
                output.write(this.B[i][j] + " ");
            }
            output.newLine();
        }
        output.newLine();
        output.close();
    }

    public void zoradRiadok(int riadok) {           //zoradenie urciteho riadka pomocou bubble sortu
        for (int i = 0; i < this.B.length - 1; i++) {
            for (int j = 0; j < this.B.length - i - 1; j++) {
                if (this.B[riadok][j].compareTo(this.B[riadok][j + 1]) > 0) {
                    String docasny = this.B[riadok][j];
                    this.B[riadok][j] = this.B[riadok][j + 1];
                    this.B[riadok][j + 1] = docasny;
                }
            }
        }
    }

    public void zoradStplec(int stlpec){        //zoradenie urciteho stlpca pomocou insertion sortu
        for (int i = 0; i < this.stlpce - 1; i++) {
            int j = i + 1;
            String docasna = this.B[j][stlpec];
            while (j > 0 && this.B[j - 1][stlpec].compareTo(docasna) > 0) {
                this.B[j][stlpec] = this.B[j - 1][stlpec];
                j--;
            }
            this.B[j][stlpec] = docasna;
        }
    }


    public void zoradHlavnuDiagonalu(){         //zoradenie hlavnej diagonaly pomocou selection sortu
        for (int i = 0; i < this.B.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < this.B.length; j++) {
                if (this.B[j][j].compareTo(this.B[maxIndex][maxIndex]) < 1) maxIndex = j;
            }
            String tmp = this.B[i][i];
            this.B[i][i] = this.B[maxIndex][maxIndex];
            this.B[maxIndex][maxIndex] = tmp;
        }
    }
    public void zoradVedlajsiuDiagonalu() {         //zoradenie vedlajsej diagonaly pomocou selection sortu
        String[] x = new String[this.B.length];
        int n = this.B.length - 1;
        for (int i = 0; i < this.B.length; i++) {
                x[i] = this.B[i][n];
                n--;
        }
        for (int i = 0; i < x.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < x.length; j++) {
                if (x[j].compareTo(x[maxIndex]) < 1) maxIndex = j;
            }
            String tmp = x[i];
            x[i] = x[maxIndex];
            x[maxIndex] = tmp;
        }
        n = this.B.length - 1;
        for (int i = 0; i < this.B.length; i++) {
            this.B[i][n] = x[i];
            n--;
        }
    }
}
