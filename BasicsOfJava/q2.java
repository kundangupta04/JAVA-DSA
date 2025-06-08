import java.util.Scanner;
public class q2 {
    // Take a positive integer input and tell if it is divisible by 5 or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("The given number is divisible by 5");
        }
        else{
            System.out.println("The given number is not divisible by 5");
        }
    }
}

