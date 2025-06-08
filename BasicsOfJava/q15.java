import java.util.Scanner;

public class q15 {
    // WAP to find if a number is divisible by both 3 & 5 .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%5==0){
            if(n%3==0){
                System.out.println("The number is divisible by 3 & 5.");
            }
            else{
            System.out.println("The number is divisible by 5.");

            }
        }
        else{
            System.out.println("The number is not divisible by 5.");
        }
    }
}
