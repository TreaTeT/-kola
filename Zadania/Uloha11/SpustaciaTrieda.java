package Skola.Zadania.Uloha11;

public class SpustaciaTrieda {
    public static void main(String[] args) {
        Obdlznik [] arr = new Obdlznik[10]; //pole objektov
        int pocet = 0 ; //pocet stvorcov
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = new Obdlznik(); //konstruktor
            arr[i].dajStrany(); //vyber stran
            if(arr[i].jeStvorec()==true){ //ak je to stvorec pocet++
                pocet++;
            }
            System.out.println(arr[i].vypisInfo()); //vypis
        }
        System.out.println("Pocet stvorcov je : " + pocet ); //pocet stvorcov
    }
}
