import java.util.Scanner;

public class q13 {
    // print the given pattern.
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
