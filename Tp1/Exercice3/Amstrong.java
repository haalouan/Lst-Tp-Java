import java.util.*;

public class Amstrong {

    int start, count, nbAmstrong;
    static ArrayList<Integer> tableNb = new ArrayList<>();
    public Amstrong() {
        start = 100;
        count = 0;
    }

    public void afficherBonjour(){
        System.out.println("Bonjour dans le programme de *Alouani* *Hatim*");
    }

    public void afficherAuRevoir(){
        System.out.println("\nAu revoir");
    }

    static int checkAmstrong(int nb){
        int save = nb;
        tableNb.clear();
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

    public void afficherValeurAmstrong(){
        System.out.print("Les nombres d AMSTRONG sont : ");
        while (count < 4){
            if (Amstrong.checkAmstrong(start) == 1) {
                System.out.print(start + ", ");
                count++;
            }
            start++;
        }
    }
}
