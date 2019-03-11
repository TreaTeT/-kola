package Skola.Zadania.Uloha17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SpustaciaTrieda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Ziak> ziaci = new LinkedList<Ziak>();//fronta ziakov

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Zadaj meno ziaka");
            ziaci.add(new Ziak(sc.nextLine()));//nacita objekt s menom do fronty
        }

        for(int i = 0 ;  i < 5 ; i ++){
            System.out.println((i+1) + " : " +  ziaci.poll().getMeno());//vypis
        }
    }
}
