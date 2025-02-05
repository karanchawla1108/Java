
import java.util.Scanner;



public class cwh_05_TakingInput {




    public static void main(String[] args) {
        System.out.println("Taking Input from the user.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        double a = sc.nextDouble();
        System.out.println("Enter the number 2: ");
        double b = sc.nextDouble();
        double sum = a + b;
        System.out.println("The total of sum is:");
        System.out.println(sum);

        sc.nextLine();
    // string
    System.out.println("What is your Name: ");
    String c =  sc.nextLine();
    System.out.println("Hello " + c);
    sc.close();  // ✅ Close scanner after use




    }
}
