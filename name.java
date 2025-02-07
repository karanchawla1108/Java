import java.util.Scanner;



public class name {

    public static void main(String[] args) {
        //input class.
        Scanner naam = new Scanner(System.in);
        System.out.println("Whats your name?: ");
        String username = naam.nextLine();
        System.out.println("Hello " + username);
        naam.close();



    }

}

 class Kilometers {

    public static void main(String[] args) {
        
        //kilo.
        Scanner distance = new Scanner(System.in);
        System.out.println("Enter the distance covered in Kilometers:");
        double kilo  = distance.nextDouble();
        
        Double miles = 0.62137;
        Double result  = kilo * miles;

        int resultInt = (int) Math.round(result);

        
        System.out.println(resultInt);
        distance.close();



    }



}



    

