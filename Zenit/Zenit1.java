import java.io.*;

class Zenit1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        String slovo=in.readLine().trim();
        String me=" ";
        int index=0;
        for (int i = 0; i < slovo.length(); i++) {
            me+=me;
            out.write(me.substring(index,i)+slovo.charAt(i));
            out.newLine();
        }
    in.close();
    out.close();
    }
}
