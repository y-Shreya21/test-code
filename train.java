import java.util.Scanner;

public class train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of available seats (1-30):");
        int n = scanner.nextInt();

        

        switch (n) {
            case 1,4,7,11,15,18,21,24,27,30:
                    System.out.println("You have been allotted a window seat.");
                
                    
                
                break;
            case 3,6,9,13,17,20,23,26,29:
                    System.out.println("You have been allotted an aisle seat.");
                
                break;
            case 2,5,8,12,16,19,22,25,28:
                
                    System.out.println("You have been allotted a middle seat.");
                
                    System.out.println("Sorry, no middle seat available.");
                
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close();
    }
}
