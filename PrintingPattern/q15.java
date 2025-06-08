import java.util.Scanner;

public class q15 {
    // Print the given pattern.
    //     *
    //     *
    // * * * * *
    //     *
    //     *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        if(n%2==0){
            n++;
        }
        int mr=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==mr || j==mr)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
