package Skola.Zadania.Uloha11;

import java.util.Random;

public class Obdlznik {
    private int strana_A; //strana A
    private int strana_B; //strana B
    private int  [] arr = {3,4,5}; //pole na vybranie dlzky

    public Obdlznik(){ //konstruktor bez parametrov

    }
    public void dajStrany(){ // random vyberanie stran
        Random ra = new Random();
        this.strana_A = this.arr[ra.nextInt(3)];
        this.strana_B = this.arr[ra.nextInt(3)];

    }

    public boolean jeStvorec(){ //zistenie ci to je stvorec
        if(this.strana_A == this.strana_B){
            return true;
        }else{
            return false;
        }
    }
    public String vypisInfo(){ //vypis
        if(this.jeStvorec() == true) {
            return "Obldznik ma strany : A = " + strana_A + " B = " + strana_B + " a je to stvorec."; //ak to je stvorec
        }
        else{
            return "Obldznik ma strany : A = " + strana_A + " B = " + strana_B + " a nie je to stvorec."; //ak to nie je stvorec
        }
    }

}
