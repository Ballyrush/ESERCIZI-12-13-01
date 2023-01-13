import java.util.Scanner;
public class Main {



    public static int contaRipetuti (int[] a) {
        int totRip = 0;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] == 2) {
                totRip += 1;
            }
        }
        return totRip;
    }
        public static void main(String[] args) {
            int n;

            Scanner scan = new Scanner(System.in);
            System.out.println("Inserire il numero di elementi che si vuole memorizzare");
            n = scan.nextInt();

            int[] newArray = new int[n];

            System.out.println("Inserire gli elementi");

            for (int i = 0; i < n; i++) {
                newArray[i] = scan.nextInt();
            }
            System.out.println(contaRipetuti(newArray));
      }
    }
