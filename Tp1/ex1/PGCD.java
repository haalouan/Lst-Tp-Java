package Tp1.ex1;
import java.util.Scanner;

public class PGCD {
    private int A,B;

    PGCD(int a, int b){
        A = a;
        B = b;
    }

    public void afficherBonjour(){
        System.err.println("Bonjour dans le programme de *Alouani Hatim*");
    }

    public void afficherAuRevoir(){
        System.out.println("Au revoir");
    }

    public void afficherValeurPGCD(int v){
        System.err.println("Le PGCD est : " + v);
    }
    
    public int saisirClavier(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisir un entier : ");
        int x = scanner.nextInt();
        return x;
    }

    public int calculerPGCD(){
        int a,b,reste;
        if (A >= B){
            b = A;
            a = B;
        }
        else{
            a = A;
            b = B;
        }
        while (b != 0){
            reste = a % b;
            a = b;
            b = reste;
        }
        return a;
    } 
}
