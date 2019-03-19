package Skola.Zenit.Uloha_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
public class Zenit15ske {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new TreeMap<String, Integer>(); //spravim si map
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine(); //prvy riadok je cislo pocet slov vo vete
        String[] arr = in.readLine().split(" "); //druhy riadok veta

        for (String word : arr) { //for each
            if (map.containsKey(word)) { //ak v mape mam toto slovo
                map.put(word, map.get(word) + 1); //pripocitam k jeho value +1
            } else {
                map.put(word, 1); //inak vytvorim novy zapis do mapu
            }
        }
        System.out.println(map);
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) { //for each cez map
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) { //for each cez map
                if(entry.getValue()==max){ //ak sa ich opakuje viac chceme to z najmensou hodnotou
                    System.out.println(entry.getKey()); // vypisem to z najmensou hodnotou ktore sa opakuje max krat
                    break; //zlomim ti ruku

                }

            }

        }
}
