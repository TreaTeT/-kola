package Uloha8;

import java.util.Random;

public class Pole {
    Random ra = new Random();
    private int [][] arr = new int[7][7]; //pole
    private int max ; //najvacsia hodnota pola

    public Pole(){
        for (int i = 0 ; i < 7 ; i++)
        {
            for(int j = 0 ; j < 7 ; j++)
            {
                this.arr[i][j] = ra.nextInt(31); //generovanie do pola
                this.max = 0; //set max na 0
            }
        }
    }

    public void vypis(){ //vypisovanie
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.printf("%5d ", arr[i][j]); //vypis so zarovnanim do prava
            }
            System.out.println();
        }
    }
    public void najdiMax(){ //najdenie maxu
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(this.arr[i][j] > this.max){
                    this.max = this.arr[i][j];
                }
            }
        }
        System.out.println("MAX je " + this.max);
    }
    public void najdiPozicie(){ //najdenie pozicii na ktorych sa max nachadza
        System.out.println("MAX sa nachadza na poziciach :");
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(this.arr[i][j] == this.max){
                    System.out.println("riadok : " + (i+1) + " stlpec : " + (j+1));
                }
            }
        }
    }
}
