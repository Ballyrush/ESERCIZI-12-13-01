import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Inserire una serie di valori");
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        boolean flagdue = false;

        while (true) {
            int a = scan.nextInt();
            if (a == 0) {
                System.out.println("NO");
                break;
            }
            if (a < 0) { //numero negativo
                if (flag) {
                    System.out.println("SI");
                    break;
                }
                flag = false;
            } else { // numero maggiore zero
                flag = true;
            }

        }
    }
}
