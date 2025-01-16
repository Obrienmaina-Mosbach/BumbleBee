import java.util.Scanner;

public class Earthquake {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);        
        System.out.println("Enter the Magnitude of the Earthquake? ");
        double magnitude = scnr.nextDouble(); 


        if (magnitude ==0){
            System.out.println("Enter Valid Input");
            return;
        }
        
        int category =  (magnitude < 2.0) ? 1:
                        (magnitude < 4.0) ? 2:
                        (magnitude < 4.0) ? 3:
                        (magnitude < 4.0) ? 4:
                        (magnitude < 4.0) ? 5:
                        (magnitude < 4.0) ? 6: 7;
    
        switch (category){
            case 1:
                System.out.println(" Micro: \n You're safe.");
                break;
            case 2:
                System.out.println(" Minor: \n Don't leave town yet.");
                break;
            case 3:
                System.out.println(" Light: \n Remove overhead objects from buildings");
                break;
            case 4:
                System.out.println(" Moderate: \n Clear areas with many overhead objects.");
                break;
            case 5:
                System.out.println(" Strong: \n Vacate premises");
                break;
            case 6:
                System.out.println(" Major: \n Head to safe spots");
                break;
            case 7:
                System.out.println(" Great: \n Seek help from fire department: Call 911");
                break;
        }
        
    }
    
}
