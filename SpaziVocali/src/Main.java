import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        System.out.println("Inserire la frase per iniziare");
        Scanner scan = new Scanner(System.in);
        String parola1 = scan.nextLine();

        for (int i = 0; i < parola1.length(); i++) {
            if (parola1.charAt(i) == ' ') {
                char c = parola1.charAt(i + 1);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    counter += 1;
                }


            }



        }
        System.out.println("il totale di spazi seguiti da vocali è: " + counter);
    }
}