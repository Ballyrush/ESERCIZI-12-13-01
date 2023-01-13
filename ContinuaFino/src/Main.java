import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int totale = 0;
        System.out.println("Inserire una serie di valori");
        Scanner scan = new Scanner(System.in);

        while (true) {
            int valore = scan.nextInt();

                 if (valore % 2 == 0 && valore < 0) {
                    totale += valore;
                }

                if (valore % 3 == 0 && valore > 0) {
                    totale += valore;
                }
                if (valore % 2 != 0 || valore > 0) {
                    if (valore % 3 != 0 || valore < 0)
                        break;
                }

        }
        System.out.println("il totale è: " + totale);
    }
}