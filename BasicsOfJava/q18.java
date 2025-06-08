import java.util.Scanner;

public class q18 {
    // If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of thge three.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram's age : ");
        int a = sc.nextInt();
        System.out.print("Enter Shyam's age : ");
        int b = sc.nextInt();
        System.out.print("Enter Ajay's age : ");
        int c = sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("Ram is youngest.");
            }
            else{
                System.out.println("Ajay is youngest.");

            }
        }
        else if(b<a){
            if(b<c){
                System.out.println("Shaym is youngest.");
            }
            else{
                System.out.println("Ajay is youngest.");
            }
        }
        else{
            System.out.println("Ajay is youngest.");
        }
    }
}
