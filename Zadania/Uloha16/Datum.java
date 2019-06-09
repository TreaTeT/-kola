package Uloha16;

public class Datum {

    private int den;
    private int mesiac;
    private int rok;

    public Datum(int d, int m, int r) {
        this.rok = r;
        if(isPriestupny() && m == 2 && d > 0 && d < 30){
            this.den = d;
            this.mesiac = m;
        }else{
            if(((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&d>0&&d<32)||(((m==4||m==6||m==9||m==11)&&d>0&&d<31))) {
                this.den = d;
                this.mesiac = m;
            }else{
                System.out.println("Nespravne zadany datum");
                System.exit(1);
            }
        }
    }

    public int getDen() {
        return this.den;
    }

    public int getMesiac() {
        return this.mesiac;
    }

    public int getRok() {
        return this.rok;
    }

    public void NastavDen(int den) {
        this.den = den;
    }

    public void NastavMesiac(int mesiac) {
        this.mesiac = mesiac;
    }

    public void NastavRok(int rok) {
        this.rok = rok;
    }
    public boolean isPriestupny(){
        if((rok%4==0&&rok%100==0&&rok%400==0)||(rok%4==0&&rok%100!=0)){
            return true;
        }
        else {
            return false;
        }
    }
    public void vypisInfo(){
        System.out.println(this.getDen()+"/"+this.getMesiac()+"/"+this.getRok());
    }
}