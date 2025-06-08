import java.util.Scanner;

public class q11 {
    // Print the given pattern.
    // A A A A A 
    // 2 2 2 2
    // A A A 
    // 2 2
    // A 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =1;j<=n+1-i;j++){
                if(i%2==0) System.out.print(i+" ");
                else System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
