package Skola.Zenit.Uloha_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uloha_8 {
    static int low[] = {0, 5, 3, 3, 5, 3, 4, 5, 4, 5, 5, 8, 7, 7, 7, 7, 8, 9, 8, 9};
    static int tens[] = {0, 5, 7, 7, 9, 9, 10, 11, 10, 11};

    public static int toThousand(int value){
        int res = 0;
        int h = value/100;
        if(h > 1) {
            res = res + low[h];
        }
        if(h>0) {
            res = res + 3 ; // sto
        }
        int lo = value%100;
        if(lo < 20) {
            res = res + low[lo];
        }else {
            res = res + tens[lo/10] + low[lo%10];
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int res = toThousand(N%1000);
        if(N >= 1000){
            res = res + 5; //1000
        }
        if(N >= 2000){
            res = res + toThousand(N/1000);
        }
        System.out.println(res);
    }
}
