package Skola.Zadania.Uloha9;

public class SPZ {

    private String[] Znacka;


    public SPZ(String vstup){
        this.Znacka = vstup.toUpperCase().trim().split(" ");
    }

    public String[] getZnacka() {
        return Znacka;
    }

}
