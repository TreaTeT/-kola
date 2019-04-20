package Skola.Zenit.Uloha_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uloha_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(in.readLine()); // nacitaj cislo
        int value  = 0 ; // pocet pismen
        int unitsArray[] = {0, 5, 3, 3, 5, 3, 4, 5, 4, 5, 5, 8, 7, 7, 7, 7, 8, 9, 8, 9 }; //jednotky 0-19
        int tensArray[] = { 0, 5, 7, 7, 9, 9, 10, 11, 10, 11 }; //desiatky 10-90

        int [] arr = {number/1000 , number%1000};  //rozdelim cislo na dva 11999 => [11] [999]

        for(int num  : arr){
            if(num/100 > 1){
                value = value + unitsArray[num/100];  //kolko stoviek je v cisle 999 => [9]99
            }
            if(num/100 >0){
                value = value + 3;  // ak je iba jedna tak pricotiam len sto
            }
            if(num%100 < 20){ // ak je tato cast cisla 9[99] mensia ako 20
                value = value + unitsArray[num%100];  // pripocitam z jednotiek
            }else{
                value = value + tensArray[(num%100)/10] + unitsArray[(num%100)%10];  // pripocitam z desiatok
            }
        }
        if(arr[0]> 0){ //ak je prve cislo vacsie ako 0 znamena to ze mame nejake tisicky tak pripocitam 5
            value = value + 5; // 5 => tisic
        }
        System.out.println(value);


    }
}
