import java.io.*;

class Zenit1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
        String slovo=in.readLine();
        String me="";
        for (int i = 0; i < slovo.length(); i++) {
            me+=" ";
            out.write(me+slovo.charAt(i));
            out.newLine();
        }
    in.close();
    out.close();
    }
}
