import java.util.Scanner;

public class Main {

    public static boolean trovaElemento (int [] a) {
        boolean check = false;

        for(int i = 0 ; i < a.length ; i++) {
            if (a[i] == 3) {
                check = true;
            }
                    else
                        check = false;
        }
        return check;
    }


    public static void main(String[] args) {


        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi che si vuole memorizzare");
        n = scan.nextInt();

        int[] newArray = new int[n];

        System.out.println("Inserire gli elementi");

        for(int i = 0 ; i < n ; i++) {
            newArray[i] = scan.nextInt();
        }

        System.out.println("Il valore è: " + Main.trovaElemento(newArray));
        }
    }
