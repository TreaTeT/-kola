package Uloha_12;

import java.util.Arrays;

public class pretekar {

    private double[] znamky = new double[10];
    private String tmp;

    public pretekar(String tmp){
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
