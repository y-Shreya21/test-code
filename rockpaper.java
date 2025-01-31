import java.util.Scanner;
public class rockpaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice player 1(1 = Rock, 2 = Paper, 3 = Scissors):");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("You chose Rock.");
                break;
            case 2:
                System.out.println("You chose Paper.");
                break;
            case 3:
                System.out.println("You chose Scissors.");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
        System.out.println("Enter your choice player 2(1 = Rock, 2 = Paper, 3 = Scissors):");
        int m = scanner.nextInt();
        switch (m) {
            case 1:
                System.out.println("You chose Rock.");
                break;
            case 2:
                System.out.println("You chose Paper.");
                break;
            case 3:
                System.out.println("You chose Scissors.");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        if (n == m) {
            System.out.println("It's a tie!");
        } else if (n == 1 && m == 3 || n == 2 && m == 1 || n == 3 && m == 2) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }


        scanner.close();
    }
    
}
