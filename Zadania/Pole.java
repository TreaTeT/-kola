package Uloha2;

import java.io.*;
import java.util.Scanner;

public class Pole {
    private int stlpce;
    private int riadky;
    private char [][] arr;
    public Pole(int riadky , int stlpce){
        this.arr = new char[riadky][stlpce];
        this.stlpce = stlpce;
        this.riadky = riadky;
    }

    public void klavesnica(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < this.arr.length; i++){
            for(int j = 0 ; j < this.arr[i].length;j++){
                this.arr[i][j] = sc.next().charAt(0);
            }
        }
    }
    public void subor() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("pole.txt"));
        for(int i = 0 ; i < this.arr.length; i++){
            for(int j = 0 ; j < this.arr[i].length;j++){
                this.arr[i][j] = input.readLine().charAt(0);
            }
        }
        input.close();
    }
    public void zapis() throws IOException{
        BufferedWriter output = new BufferedWriter(new FileWriter("polevypis.txt"));
        for(int i = 0 ; i < this.arr.length; i++){
            for(int j = 0 ; j < this.arr[i].length;j++) {
                output.write(this.arr[i][j]);
                output.write(" ");

            }
            output.newLine();
        }
        output.close();
    }

    public void vypis(){
        for(int i = 0 ; i < this.arr.length; i++){
            for(int j = 0 ; j < this.arr[i].length;j++){
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void vymenRiadky(int riadok1 , int riadok2){
        for(int i = 0 ;i < this.stlpce; i ++){

            char pom = this.arr[riadok1-1][i];

            this.arr[riadok1-1][i] = this.arr[riadok2-1][i];

            this.arr[riadok2-1][i] = pom;

        }
    }
    public void vymenStlpce(int stlpec1 , int stlpec2){
        for(int i = 0 ;i < this.riadky; i ++){

            char pom = this.arr[i][stlpec1-1];

            this.arr[i][stlpec1-1] = this.arr[i][stlpec2-1];

            this.arr[i][stlpec2-1] = pom;

        }
    }
    public void najdi(char c){
        boolean check = false;
        for(int i = 0 ; i < this.arr.length; i++){
            for(int j = 0 ; j < this.arr[i].length;j++){
                if(this.arr[i][j]==c){
                    check = true;
                    System.out.println("Char sa nachadza na pozicii [" + i + ", " + j + "]");
                }
            }
        }
        if(check == false){
            System.out.println("char tam nie je");
        }
    }
}


