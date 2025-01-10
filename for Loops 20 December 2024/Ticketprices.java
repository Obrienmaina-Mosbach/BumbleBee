
import java.util.Scanner;

public class Ticketprices {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("What is your age? ");
       int age = Integer.parseInt(scanner.nextLine());
    
        if (age <= 30){
            System.out.println("You get a discount");
        }
        else{
            System.out.println("You dont qualify for a discount");
        }
    }
}
