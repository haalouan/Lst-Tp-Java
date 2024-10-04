import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour dans l algorithme d Euclide");
        int ex = 1;
        int reste;
        while (ex == 1){
            System.out.print("Saisir la valeur de A : ");
            int A = scanner.nextInt();
            System.out.print("Saisir la valeur de B : ");
            int B = scanner.nextInt();
            if (!(A >= B && B > 0)){
                System.out.println("Erreur -> veuillez sasir une forme correcte (A >= B > 0)");
                continue;
            }
            while (B != 0) {
                reste = A % B;
                A = B;
                B = reste;  
            }
            System.err.println("le PGSD est : " + A);
            System.out.print("Entrez 1 si vous voulez répéter : ");
            ex = scanner.nextInt();
        }
        System.out.println("Au revoir");
        return;
    }
}
