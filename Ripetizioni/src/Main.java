import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.println("Inserire il numero di caratteri che si vuole memorizzare");

        n = scan.nextInt();

        System.out.println("Inserire dei caratteri per iniziare");

        char [] newArray = new char[n];

        for (int i = 0; i < n ; i++) {
            newArray[i] = scan.next().charAt(0);;
        }


        System.out.println("Gli elementi dell'Array al contrario sono: ");
        for (int k = n-1 ; k >= 0; k--) {
            System.out.println(newArray[k]);
        }

    }
}