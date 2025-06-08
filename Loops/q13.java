import java.util.Scanner;

public class q13 {
    // WAP to check if a number is prime or not .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int hf = 1;
        for(int i=1; i<n;i++){
            if(n%i==0){
                hf = i;
            }
        }
        if(hf==1){
            System.out.println("The given number is a prime number.");
        }
        else{
            System.out.println("The given number is a composite number.");
        }
    }
}
