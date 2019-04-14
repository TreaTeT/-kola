import java.io.*;

class Zenit4 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int dlzka = Integer.parseInt(in.readLine());
        String stav = in.readLine();
        String kod = in.readLine();
        int astav[] = new int[dlzka];
        int kodp[] = new int[dlzka];
        int pocet = 0;
        for (int i = 0; i < dlzka; i++) {
            astav[i] = Character.getNumericValue(stav.charAt(i));
            kodp[i] = Character.getNumericValue(kod.charAt(i));

            int x = Math.abs(astav[i] - kodp[i]);
            int y = 10 - x;

            if ( x < y)
                pocet += x;
            else
                pocet += y;
        }
        System.out.println(pocet);
    }
}








