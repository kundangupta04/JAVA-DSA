import java.util.Scanner;

public class q13 {
    // If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram's age : ");
        int a = sc.nextInt();
        System.out.print("Enter Shyam's age : ");
        int b = sc.nextInt();
        System.out.print("Enter Ajay's age : ");
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println("Ram is youngest.");
        }
        else if(b<a && b<c){
            System.out.println("Shyam is youngest.");
        }
        else{
            System.out.println("Ajay is youngest.");
        }
    }
}
