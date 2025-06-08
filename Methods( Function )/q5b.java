import java.util.Scanner;

public class q5b {
    public static int fact(int x){
        int xfact=1;
        for(int i=1;i<=x;i++){
            xfact*=i;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        System.out.print("Enter r: ");
        int r =sc.nextInt();
        int npr = fact(n)/fact(n-r);
        System.out.println("nPr = "+npr);
    }
}
