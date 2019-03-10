package Skola.Zadania.Uloha14;

import java.io.*;

public class Retazec {
    private String znaky;

    public Retazec () {

    }

    public void odkoduj(int shift){ // dekodovanie
        String decoded = ""; //dekodovany string
        char decodedchar = ' '; //dekodovany char
        shift = 26 - shift; //vypocet potrebny pre dekodovanie
        for(int i = 0; i < this.znaky.length(); i++) { // loop cez string
            if (this.znaky.charAt(i) == ' ' || this.znaky.charAt(i) == ',' || this.znaky.charAt(i) == '.' || this.znaky.charAt(i) == '?' || this.znaky.charAt(i) == '!') { //ak je char ciarka , bodka alebo pod
                decoded = decoded + this.znaky.charAt(i); // tak ho tam necham
                continue; //skipnem iteraciu
            }
                if (Character.isUpperCase(this.znaky.charAt(i))) { // ak je to velke pismeno
                    decodedchar = (char) (((this.znaky.charAt(i) + shift - 65) % 26 + 65)); //dekodovanie pre velke
                } else {
                    decodedchar = (char) (((this.znaky.charAt(i) + shift - 97) % 26 + 97)); //dekodovanie pre male
                }
                decoded = decoded + decodedchar;// dekodovany char pridam k dekodovanemu stringu

        }
        this.znaky = decoded; //do mojho stringu ulozim dekodovany
    }

   public void zakoduj(int shift){
       String coded = ""; //zakodovany string
      char codedchar = ' '; //zakodovany char
       for(int i = 0; i < this.znaky.length(); i++) { // loop cez string
           if (this.znaky.charAt(i) == ' ' || this.znaky.charAt(i) == ',' || this.znaky.charAt(i) == '.' || this.znaky.charAt(i) == '?' || this.znaky.charAt(i) == '!') { //ak je to znamienko
               coded = coded + this.znaky.charAt(i); //pridam ku stringu
               continue; //skipnem iteraciu
           }
               if (Character.isUpperCase(this.znaky.charAt(i))) { //ak je to velke pismeno
                   codedchar = (char) (((this.znaky.charAt(i) + shift - 65) % 26 + 65)); //kodovanie velkeho
               } else {
                   codedchar = (char) (((this.znaky.charAt(i) + shift - 97) % 26 + 97));//kodocanie maleho
               }

               coded = coded + codedchar;//zakodovany char pridam k zakodovanemu stringu

       }
       this.znaky = coded;//do mojho stringu ulozim zakodovany string
   }

    public int pocetSpoluhlasok(){ //pocitanie spoluhlasok
        int pocet = 0 ;
        for(int i = 0 ; i < this.znaky.length();i++){ //loop cez string
            switch (this.znaky.charAt(i)){
                case 'b' : pocet++; break;
                case 'c' : pocet ++; break;
                case 'd' : pocet ++; break;
                case 'f' : pocet++; break;
                case 'g' : pocet++; break;
                case 'h' : pocet++; break;
                case 'j' : pocet ++; break;
                case 'k' : pocet ++; break;
                case 'l' : pocet++; break;
                case 'm' : pocet++; break;
                case 'n' : pocet++; break;
                case 'p' : pocet ++; break;
                case 'r' : pocet ++; break;
                case 's' : pocet++; break;
                case 't' : pocet++; break;
                case 'v' : pocet++; break;
                case 'w' : pocet ++; break;
                case 'x' : pocet ++; break;
                case 'z' : pocet++; break;

                default: break;
            }
        }
        return pocet;
    }
    public int pocetSamohlasok(){ //pocitanie samohlasok
        int pocet = 0 ;
        for(int i = 0 ; i < this.znaky.length();i++){
            switch (this.znaky.charAt(i)){
                case 'a' : pocet++; break;
                case 'e' : pocet ++; break;
                case 'i' : pocet ++; break;
                case 'y' : pocet++; break;
                case 'o' : pocet++; break;
                default: break;
            }
        }
        return pocet;
    }
    public char najvacsiZnak(){ //hladanie znaku najdalej v abecede (znak s najvacsou ascii hodnotou)
        int max =  0;
        for(int i = 0 ; i < this.znaky.length() ; i++){
            int tmp = (int)this.znaky.charAt(i); //zisti ascii hodnotu charu
            if(tmp > max){ //ak je vacsia ako max
                max = tmp;
            }
        }
        return  (char)max; //prehodim max na char
    }
    public void zmaz(int pozicia){ //nahradi znak na pozicii medzerou
        this.znaky = this.znaky.replace(this.znaky.charAt(pozicia) , ' ');
    }

    public int pocet(){ //pocitanie slov
        int pocet = 0;
        char [] arr =  this.znaky.toCharArray();
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == ' '){
                pocet ++;
            }
        }
        return pocet;
    }
    public void zmen(int pozicia , char hodnota) { //zmeni char na danej pozici za zadany char
        this.znaky = this.znaky.replace(this.znaky.charAt(pozicia) , hodnota);
    }

    public char daj(int pozicia){ //vrati char na zadanej pozicii
        return this.znaky.charAt(pozicia);
    }

    public void nacitajSubor() throws IOException { //nacitanie suboru
        BufferedReader in  = new BufferedReader(new FileReader("Znaky.txt"));
        this.znaky = in.readLine();
        this.znaky = this.znaky.trim();
        in.close();
    }

    public void vypisSubor() throws IOException{ //vypis do suboru
        BufferedWriter out = new BufferedWriter(new FileWriter("ZnakyVypis.txt"));
        out.write(this.znaky);

        out.close();
    }


}
