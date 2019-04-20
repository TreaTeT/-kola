package Uloha_9;

import java.util.*;

public class SPZ {

    private String Znacka[];
    private Map<String, Integer> db = new HashMap<String, Integer>();

    public SPZ(){
    }
    public String[] getZnacka() {
        return Znacka;
    }

    public void nacitanie(String vstup) {

        this.Znacka = vstup.toUpperCase().trim().split(" ");//nacitanie zadanych udajov
        if (this.db.containsKey(getZnacka()[0])) {//ak uz bola SPZ zadana pripocitam k nej pokutu
            this.db.put(getZnacka()[0], this.db.get(getZnacka()[0]) + Integer.parseInt(getZnacka()[1]));
        }
        else
            this.db.put(getZnacka()[0], Integer.parseInt(getZnacka()[1]));//ak nebola vlozim novu do mapu

        }

        public void vypis() {
        if (db.isEmpty())//ak nebolo nic zadane
            System.out.println("Nezadal si ziadne SPZ");

        else {
            for (String key : db.keySet()) {//for each
                System.out.println(key + " " + db.get(key));//vypis vsetkych SPZ + pokut
                }
            }
        }
    }


