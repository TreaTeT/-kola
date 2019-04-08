package uloha_18;

import java.util.Deque;
import java.util.LinkedList;

public class Autobus {

    private Deque<String> autobus = new LinkedList<>();
    public Autobus(){ }

    public void nastup(String meno){
        this.autobus.add(meno);
    }
    public void vystup(){
        for (int i = 0; i < 30; i++){
            if (i < 19){
                if (i == 0)
                    System.out.print("Knihy dostanú: ");
                System.out.print(autobus.pollLast() + ", ");
            }
            else {
                if (i == 20) {
                    System.out.println();
                    System.out.print("Knihy nedostanú: ");
                }
                System.out.print(autobus.pollLast() + ", ");
            }
        }
    }

}
