import java.util.Scanner;
public class Main {

    public static int sommaInputArray (int[] a) {
        int totale = 0;
        for (int i = 0; i < a.length ; i++) {
            totale += a[i];
        }
        return totale;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.println("Inserire il numero di elementi che si vuole memorizzare");

        n = scan.nextInt();


        System.out.println("Inserire dei numeri per iniziare");

        int[] newArray = new int[n+1];

        for (int i = 0; i < n ; i++) {
            newArray[i] = scan.nextInt();
        }




        System.out.println("Il totale è: " + Main.sommaInputArray(newArray));
    }
}