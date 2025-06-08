import java.util.Scanner;

public class q9{
    // Take positive integer input and tell if it is a three digit number or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("The given integer is a three digit number.");
        }
        else{
            System.out.println("The given integer is not a three digit number.");

        }
    }
}