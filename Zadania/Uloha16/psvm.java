package Uloha16;

import java.util.Scanner;

public class psvm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadajte datum : ");
        String [] date = sc.nextLine().split("/");
        Datum datum = new Datum(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
        datum.vypisInfo();
    }
}
