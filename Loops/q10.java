import java.util.Scanner;

public class q10 {
    // Display this GP - 1,2,4,8,16,32,..upto 'n' terms.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n= sc.nextInt();
        int a = 1;
        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            a*=2;
        }
    }
}
