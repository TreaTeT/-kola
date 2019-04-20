package Uloha_9;

import java.util.*;

public class spust {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pomoc;
        SPZ a = new SPZ();
        while(!(pomoc = sc.nextLine()).isEmpty()) {//kym nezadam prazdny retazec tak pokracujem
            a.nacitanie(pomoc);
        }
        a.vypis();
    }
}
