import java.util.Scanner;

public class q6 {
    // Pascal triangle

    //        1
    //       1 1 
    //      1 2 1 
    //     1 3 3 1 
    //    1 4 6 4 1 
    //  1 5 10 10 5 1 
    // 1 6 15 20 15 6 1 
    public static int fact(int x){
        int xfact=1;
        for(int i=1;i<=x;i++){
            xfact*=i;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n =sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<=i;j++){
                int icj = fact(i)/(fact(j)*fact(i-j));
                System.out.print(icj+"    ");
            }
            System.out.println();
        }

    }
}

