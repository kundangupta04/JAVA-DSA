import java.util.Scanner;

public class q7 {
    // Print The given pattern.
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
