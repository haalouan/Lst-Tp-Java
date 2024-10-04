import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    static int checkAmsrong(int nb){
        ArrayList<Integer> tableNb = new ArrayList<>();
        int save = nb;
        while (nb != 0)
        {
            tableNb.add(nb % 10);
            nb = nb / 10;
        }
        int i = 0;
        int totale = 0;
        int n = 0;
        while (i < tableNb.size()){
            n = tableNb.get(i);
            totale = totale + (n * n * n);
            i++;
        }
        if (totale == save)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 100;
        int count = 0;
        int nbAmstrong;
        System.out.println("Bounjour dans le programme de Alouani Hatim");
        System.out.print("Les nombres d AMSTRONG : ");
        while (count < 4){
            if (checkAmsrong(start) == 1) {
                System.out.print(start + ", ");
                count++;
            }
            start++;
        }
        System.out.println("\nAu revoir");
        return;
    }
}
