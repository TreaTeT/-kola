package Uloha_9;

import java.util.*;

public class spust {

    public static void main(String[] args) {
        Map<String, Integer> db = new HashMap<String, Integer>();
        Queue<String> spz = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            SPZ a = new SPZ(sc.nextLine());
            if (a.getZnacka()[0].equals("")) {
                break;
            }
            if (db.containsKey(a.getZnacka()[0])){
                int pokuta = db.get(a.getZnacka()[0]) + Integer.parseInt(a.getZnacka()[1]);
                db.put(a.getZnacka()[0], pokuta);
            }
            else {
                db.put(a.getZnacka()[0], Integer.parseInt(a.getZnacka()[1]));
                spz.add(a.getZnacka()[0]);
            }
        }

        while (!spz.isEmpty()) {
            String pomoc = spz.poll();
            System.out.println(pomoc + " " + db.get(pomoc));
        }
    }

}
