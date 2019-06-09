package Uloha19;

public class Zamestnanci {


    private int evidencne_cislo;
    private String meno;
    private String priezvisko;
    private int vek;

    Zamestnanci(int id, String meno, String priezvisko, int vek){
        this.evidencne_cislo = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public int getEvidencne_cislo() {
        return evidencne_cislo;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getVek() {
        return vek;
    }

}
