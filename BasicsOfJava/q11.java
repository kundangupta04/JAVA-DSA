import java.util.Scanner;

public class q11 {
    // WAP to input a number and tell if it is divisible by 5 but not divisible by z.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3!=0){
            System.out.println("the number is divisible by 5 but not divisible by 3.");
        }
        else if(n%5==0 && n%3==0){
            System.out.println("the number is divisible by both 5 and 3.");
        }
        else{
            System.out.println("the number is not divisible by both 5 and 3.");

        }
    }
}
