import java.util.Scanner;


public class cwh_06_excercise_per {
    
public static void main(String[] args) {
    
    
    /* calculating the percentage.
    Formula = total marks / maximum marks * 100 */ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks of Math out of 100");
    int math = sc.nextInt();
    while (math > 100){
        System.out.println("Enter the number less than 100");
        math = sc.nextInt();
    }
    System.out.println("Enter the marks of English out of 100");
    int english = sc.nextInt();
    while (english > 100){
        System.out.println("Enter the number less than 100");
        english = sc.nextInt();
    }
    System.out.println("Enter the marks of Science out of 100");
    int science = sc.nextInt();
    while (science > 100){
        System.out.println("Enter the number less than 100");
        science = sc.nextInt();
    }
    System.out.println("Enter the marks of Computer out of 100");
    int computer = sc.nextInt();
    while (computer > 100){
        System.out.println("Enter the number less than 100");
        computer = sc.nextInt();
    }
    System.out.println("Enter the marks of Arts out of 100");
    int arts = sc.nextInt();
    while (arts > 100){
        System.out.println("Enter the number less than 100");
        arts = sc.nextInt();
    }
    


    // System.out.println(math +"," + english + "," + science + ","+ computer + ","+ arts);

    int totalMarks = math + english + science + computer + arts;
    System.out.println(totalMarks);

    double percentage = (totalMarks / 500.0) * 100;
    System.out.println(percentage);

    sc.close();


    






   















}



}
