package Skola.Zenit.Uloha_3;
import java.io.*;

class zenit_3 {

    public static void main(String[] args)throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());            // nacitanie poctu slov
        String[] x = in.readLine().split(" ");        //nacitanie jednotlivycj slov

        for (int i = 0; i < N; i++){
            for (int j = x[i].length() - 1; j >= 0; j--){
                System.out.print(x[i].charAt(j));          //vypisovanie uz otoceniych slov
            }
            System.out.print(" ");
        }

    }
}
