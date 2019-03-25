package Skola.Zadania.Uloha12;

import java.util.Arrays;

public class krasokorculiar {

    private double[] znamky = new double[10];
    private String tmp;

    public krasokorculiar(String tmp){
        this.tmp = tmp;
    }

    public void vstup() {
        String[] input = tmp.split(" ");
        for (int i = 0; i < 10; i++){
            this.znamky[i] = Double.parseDouble(input[i]);
        }
    }

    public double priemer(){
        Arrays.sort(znamky);
        double priemer = 0;
        for (int i = 1; i < 9; i++){
            priemer += znamky[i];
        }
        priemer /= 8;
        return priemer;
    }

}
