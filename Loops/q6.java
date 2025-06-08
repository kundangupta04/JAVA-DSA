import java.util.Scanner;

public class q6 {
    // print the table of n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=n; i<=n*10;i+=n){
            System.out.print(i+" ");
        }
    }
}
