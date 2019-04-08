package uloha_18;

public class spust {

    public static void main(String[] args) {

        String [] mena = {"meno1","meno2","meno3","meno4","meno5","meno6","meno7","meno8","meno9","meno10","meno11","meno12","meno13","meno14","meno15","meno16","meno17","meno18","meno19","meno20","meno21","meno22","meno23","meno24","meno25","meno26","meno27","meno28","meno29","meno30"};
        Autobus a = new Autobus();
        for (int i = 0; i < mena.length; i++){
            a.nastup(mena[i]);
        }
        a.vystup();
    }

}
