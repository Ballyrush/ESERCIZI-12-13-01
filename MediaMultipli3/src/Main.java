import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi usare?");
        n = scan.nextInt();
        System.out.println("Quali numeri vuoi usare?");
        int[] newArray = new int[n];

        for (int i = 0 ; i < n ; i++ ) {
            newArray[i] = scan.nextInt();
        }

        int counterArray = 0;

        for (int i = 0 ; i < n ; i++ ) {
            if (newArray[i] % 3 == 0) {
                counterArray +=1;
            }
        }


        int[] newArray2 = new int[counterArray];

        for (int i = 0 ; i < n ; i++ ) {
            if (newArray[i] % 3 == 0) {
                newArray2[i] = newArray[i];
            }
        }

        int totale = 0;

        for (int i = 0 ; i < newArray2.length ; i++ ) {
            totale += newArray2[i];
        }


        double media = totale / counterArray;


        System.out.println("La media è " + media);

    }
}