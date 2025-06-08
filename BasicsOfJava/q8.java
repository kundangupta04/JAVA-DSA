import java.util.Scanner;

public class q8 {
    // take input of a student and print the Grade according to marks.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage of the Student : ");
        int p = sc.nextInt();
        if(p>=90){
            System.out.println("Grade : Excellent");
        }
        else if(p>=80){
            System.out.println("Grade : Very Good");
        }
        else if(p>=70){
            System.out.println("Grade : Good");
        }
        else if(p>=60){
            System.out.println("Grade : Can do better");
        }
        else if(p>=50){
            System.out.println("Grade : Average");
        }
        else if(p>=40){
            System.out.println("Grade : Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
