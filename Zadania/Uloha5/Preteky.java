package Uloha5;


import java.util.Scanner;

public class Preteky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj počet pretekárov");//pocet pretekarov
        Pretekar [] arr = new Pretekar[sc.nextInt()];//pole pretekarov
        for(int i = 0 ;i < arr.length ; i ++){
            arr[i] = new Pretekar();//konstruktor
        }
        if(arr.length<=8){//ak ich je 8 a menej
            for(int i = 0 ; i < arr.length; i++){
                arr[i].hadz6();//hodi 6 hodov
                arr[i].najdiMax();//najde max
                arr[i].najdiMin();//najde min
                arr[i].najdiPriemer();//najde priemer
            }
            int n = arr.length; // bubble sort podla max atributu
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j].getMax() < arr[j+1].getMax())
                    {
                        Pretekar temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            for(int i = 0 ; i < arr.length ; i++){ //vypis
                System.out.println("Poradie");
                System.out.println(i+1 + " MAX : " + arr[i].getMax() + " MIN : " + arr[i].getMin() + " AVG : " + arr[i].getPriemer() );
            }
        }
        else{
            for(int i = 0 ; i < arr.length; i++){//kazdy hadze 3
                arr[i].hadz3();
                arr[i].najdiMax();
            }
            int n = arr.length; //sortnem vsetkych podla max atributu
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j].getMax() < arr[j+1].getMax())
                    {
                        Pretekar temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            for(int i = 0 ; i < 8; i++){//najlepsich osem hadze dalsie 3
                arr[i].hadzdalsie3();
                arr[i].najdiMax();
                arr[i].najdiMin();
                arr[i].najdiPriemer();

            }
             n = arr.length;//sortnem tych najlepsich
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j].getMax() < arr[j+1].getMax())
                    {
                        Pretekar temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            for(int i = 0 ; i < 8 ; i++){//vypis
                System.out.println("Poradie");
                System.out.println(i+1 + " MAX : " + arr[i].getMax() + " MIN : " + arr[i].getMin() + " AVG : " + arr[i].getPriemer() );
            }
        }
    }
}
