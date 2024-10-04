import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int exit = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour dans le programme qui calcule la racine carree");
        while (exit == 1){
            System.out.print("Saisir la valeur de A : ");
            double A = scanner.nextDouble();
            double Un = 1.0;
            double save1 = Un;
            double save2 = 0.0;
            if (A < 0)
            {
                System.out.println("Erreur Sasir un nb positive");
                continue;
            }
            while (Math.abs(save1 - save2) > 0.001) {
                save1 = Un;
                Un = (1.0 / 2) * (Un + A / Un);
                save2 = Un;
            }
            if (A == 0)
                System.out.println("la racine carree de " + A + " est : 0"); 
            else
                System.out.println("la racine carree de " + A + " est : " + Un);
            System.out.print("Entrez 1 si vous voulez répéter : ");
            exit = scanner.nextInt();
        }
        System.out.println("Au revoir");
        return;
    }
}
