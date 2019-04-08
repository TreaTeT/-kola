package Uloha_15;

public class Cas {

    private int hodiny;
    private int minuty;
    private int sekundy;

    public Cas(){ }
    public void nastavHodiny(int hodiny){
        this.hodiny = hodiny;
    }
    public void nastavMinuty(int minuty){
        this.minuty = minuty;
        if (this.minuty > 60){
            while (this.minuty >= 60){
                this.minuty -= 60;
                this.hodiny++;
            }
        }
    }
    public void nastavSekundy(int sekundy){
        this.sekundy = sekundy;
            if (this.sekundy >= 3600){
                while(this.sekundy >= 3600){
                    this.sekundy -= 3600;
                    this.hodiny++;
                }
            }
        if (this.sekundy >= 60){
            while (this.sekundy >= 60){
                this.sekundy -= 60;
                this.minuty++;
            }
        }
    }
    public String zostavInfo(){
        return this.hodiny + ":" + this.minuty + ":" + this.sekundy;
    }

}
