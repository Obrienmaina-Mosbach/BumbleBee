
import java.util.Scanner;

public class Ticketprices {
    public static void main(String[] args) {

        System.out.println("Welcome to Gizmo discounts. To see if you qualify;");
        Scanner scnr = new Scanner(System.in);        
        System.out.println("What is your age? ");
        int age = Integer.parseInt(scnr.nextLine());
        System.out.println("What is your age? ");
        int Price = Integer.parseInt(scnr.nextLine());;
    
        if (age == 0){
            System.out.println("Enter a valid age");
        }
        else if(age <= 5){
            System.out.println("You get a 40% discount: " + "The new product price is Euro " + Price * 0.6);
        }
        else if(age <= 10){
            System.out.println("You get a 30% discount: " + "The new product price is Euro " + Price * 0.7);
        }
        else if(age <= 20){
            System.out.println("You get a 20% discount: " + "The new product price is Euro " + Price * 0.8);
        }
        else if(age <= 30){
            System.out.println("You get a 10% discount: " + "The new product price is Euro " + Price * 0.9);
        }
        else{
            System.out.println("You don't qualify for a discount");
        }
    }
}
