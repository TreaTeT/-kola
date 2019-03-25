package Skola.Zenit.Uloha_6;

import java.io.*;
import java.util.Arrays;

class zenit_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] str_1 = in.readLine().toCharArray(); //nacitanie
        char[] str_2 = in.readLine().toCharArray(); //nacitanie
        boolean pravda = true;
        if (str_1.length != str_2.length) {         // ak maju rozne dlzky tak ińie
            System.out.println("nie");
        }
        else {
            Arrays.sort(str_1);
            Arrays.sort(str_2);
            for (int i = 0; i < str_1.length; i++)  //porovnanie vsetkych znakov
                if (str_1[i] != str_2[i]){
                    pravda = false;
                    break;
                }
            if (!pravda){                           //vypis
                System.out.println("nie");
            }
            else {
                System.out.println("ano");
            }
        }


    }

}
