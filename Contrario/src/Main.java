
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("Inserire la parola da convertire");
        Scanner scan = new Scanner(System.in);
        String parola1 = scan.nextLine();
        char[] newArray = parola1.toCharArray();


        for (int i = newArray.length-1 ;  i >= 0 ; i--) {
            System.out.print(newArray[i]);
            
        }






        }





    }
