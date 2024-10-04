package Tp1.ex1;
import Tp1.ex1.PGCD;

public class Main {
    public static void main(String[] args) {
        int a,b,result;

        PGCD objet = new PGCD(0, 0);
        objet.afficherBonjour();
        a = objet.saisirClavier();
        b = objet.saisirClavier();
        objet = new PGCD(a, b);
        result = objet.calculerPGCD();
        objet.afficherValeurPGCD(result);
        objet.afficherAuRevoir();
    }
}

