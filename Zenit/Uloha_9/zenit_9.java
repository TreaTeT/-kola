import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class zenit_9 {

    static int pocetO(char[][] ocean) {
        int m = ocean.length;
        int n = ocean[0].length;

        int pocet = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(ocean[i][j] == '#'){//najdenie prveho znaku ostrova
                    pocet++;
                    spoje(ocean, i, j);
                }
            }
        }

        return pocet;
    }

    static void spoje(char[][] ocean, int i, int j){

        if(ocean[i][j] != '#')//overenie ci dany znak je ostrov
            return;// ak nie idem het

        ocean[i][j]='X';

        spoje(ocean, i - 1, j);//overenie ci je okolo ostrova iny ostrov
        spoje(ocean, i + 1, j);//overenie ci je okolo ostrova iny ostrov
        spoje(ocean, i, j - 1);//overenie ci je okolo ostrova iny ostrov
        spoje(ocean, i, j + 1);//overenie ci je okolo ostrova iny ostrov
    }


    public static void main(String[] args)throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] cisla = in.readLine().split(" ");
        char[][] ocean = new char [Integer.parseInt(cisla[0])][Integer.parseInt(cisla[1])];

        for (int i = 0; i < ocean.length; i++) {
            ocean[i] = in.readLine().toCharArray();
        }

        System.out.println(pocetO(ocean));
        in.close();
         }
    }

