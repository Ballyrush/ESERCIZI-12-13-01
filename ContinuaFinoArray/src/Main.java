import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        int totale = 0;
        System.out.println("Inserire il numero di valori da memorizzare");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        System.out.println("Inserire i valori da memorizzare");

        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i < 0) {
                totale += i;
            }

            if (i % 3 == 0 && i > 0) {
                totale += i;
            }
        }

        System.out.println("il totale è: " + totale);
    }
}