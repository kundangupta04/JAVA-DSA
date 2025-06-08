import java.util.Scanner;

public class q2 {
    // print numbers from a to n.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=a; i<=n; i++){
            System.out.println(i);
        }
    }
}
