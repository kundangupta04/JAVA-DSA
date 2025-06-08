import java.util.Scanner;

public class q5 {
    // Print the given pattern.
    // A B C D
    // A B C D
    // A B C D
    // A B C D

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=65; i<=64+n;i++){
            for(int j=65; j<=64+n; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
