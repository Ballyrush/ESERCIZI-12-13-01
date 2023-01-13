import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserire la frase per iniziare");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();

        boolean parola = frase.contains("ciao");

        System.out.println(parola);

    }
}