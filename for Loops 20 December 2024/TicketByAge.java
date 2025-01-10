import java.util.Scanner;

public class TicketByAge {
    public static void main(String[] args) {

        System.out.println("Welcome to Gizmo discounts. To see if you qualify;");
        Scanner scnr = new Scanner(System.in);        
        System.out.println("What is your age? ");
        int age = Integer.parseInt(scnr.nextLine());
        System.out.println("What is your age? ");
        int Price = Integer.parseInt(scnr.nextLine());
    
        switch (age){
            case 0:
                System.out.println("Enter a valid age.");
                    break;
            case 1, 2, 3, 4:
                System.out.println("You get a 50% discount: \n The new product price is Euro " + Price * 0.5);
                    break;
            case 5, 6, 7, 8, 9:
                System.out.println("You get a 40% discount: \n The new product price is Euro " + Price * 0.6);
                    break;
            case 10, 11, 12, 13, 14, 15, 16:
                System.out.println("You get a 30% discount: \n The new product price is Euro " + Price * 0.7);
                        break;
            case 17, 18:
                    System.out.println("You get a 20% discount: \n The new product price is Euro " + Price * 0.8);
                        break;
            default:
                    System.out.println("You don't qualify for a discount");
        }
    }
}

