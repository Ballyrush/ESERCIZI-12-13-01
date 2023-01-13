import java.util.Scanner;


public class Main {

    public static int[] stampaInverso(int a) {
        int[] array2 = new int[a];
        for (int i = 0 ;  i < a ; i++) {
            Scanner input = new Scanner(System.in);
            array2[i] = input.nextInt();
        }
        return array2;
    }






    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n ;

        System.out.println("Inserire il numero di elementi che si vuole memorizzare");
        n = scan.nextInt();

        int[] newArray = new int[n];

        System.out.println("Inserire gli elementi");
        int[] array4 = Main.stampaInverso(n);
        for (int i = n-1 ; i >= 0 ; i--) {
            System.out.println(array4[i]);
        }
    }
}