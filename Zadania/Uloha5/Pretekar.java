package Skola.Zadania.Uloha5;

import java.util.Arrays;
import java.util.Scanner;

public class Pretekar {
    private int max; //max hod
    private int min; //min hod
    private double priemer; //priemer hodov
    private int [] hody = new int[6]; //pole hodov

    public Pretekar(){
        this.max = 0;
        this.min = 100000;
        Arrays.fill(this.hody , 0); //vyplnim pole 0

    }

    public void najdiMin(){ //nájdenie min hodu
        for(int i = 0 ; i < this.hody.length;i++){
            if(this.hody[i] < this.min && this.hody[i]!=0){
                this.min = this.hody[i];
            }
        }
    }

    public void najdiMax(){ //nájdenie max hodu
        for(int i =0 ; i < this.hody.length;i++){
            if(this.hody[i] > this.max){
                this.max = this.hody[i];
            }
        }
    }
    public void najdiPriemer(){ //vypočítanie priemerného hodu
        double sucet = 0 ;  //súčet všetkych hodov
        int pocet = 0;  //pocet hodov
        for (int i = 0 ; i < this.hody.length;i++){
            sucet = sucet + this.hody[i];
            pocet = pocet + 1;
            if(this.hody[i]==0){
                pocet = pocet -1; // ak je nulovy hod tak ho nepocitam
            }
        }
        this.priemer = sucet / pocet;
    }
    public void hadz6(){ //hodenie 6. hodov
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 6; i++) {
            System.out.println("Zadaj hod číslo " + (i+1));
            this.hody[i] = sc.nextInt();
        }

    }
    public void hadz3(){//hodenie 3 hodov
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i ++){
            System.out.println("Zadaj hod " + (i+1));
            this.hody[i] = sc.nextInt();
        }
    }
    public void hadzdalsie3(){//hodenie dalsich 3. hodov v pripade ze bol v top 8
        Scanner sc = new Scanner(System.in);
        for(int i = 3 ; i < 6 ; i ++){
            System.out.println("Zadaj hod " + (i+1));
            this.hody[i] = sc.nextInt();
        }

    }



    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getPriemer() {
        return priemer;
    }
}
