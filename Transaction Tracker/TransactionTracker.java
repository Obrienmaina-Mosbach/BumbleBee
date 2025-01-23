import java.util.ArrayList;
import java.util.Scanner;

public class TransactionTracker {
    public static void main(String[] args) {
        ArrayList<String> transactionTracker = new ArrayList<String>();
        System.out.println("Welcome to the Transaction Tracker!");
        System.out.println(addTransaction());
    }

    public static String addTransaction() {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type transaction: ");
        String type = scanner.nextLine();

        System.out.println("Enter the amount transaction: ");
        String amount = scanner.nextLine();

        System.out.println("Enter the date transaction: ");
        String date = scanner.nextLine();

        return type + ", " + amount + ", " + date;
    }
    
}
