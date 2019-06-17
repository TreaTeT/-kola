import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

class zenit17kka {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
        String[] aaa = in.readLine().split(" ");
        Set<String> send_help = new TreeSet<>();
        int i;
        for ( i = 0; i < aaa.length; i++) {
            send_help.add(aaa[i]);
        }
        System.out.println(i);
    }

}
