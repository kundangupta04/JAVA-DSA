import java.util.Scanner;

public class q14 {
    // WAP to print number from 1 to 100 but not n and m.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        for(int i=1; i<=100; i++){
            if(i==n || i==m) continue; 
            System.out.print(i+" ");
        }
    }
}
