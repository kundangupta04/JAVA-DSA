import java.util.Scanner;

public class basic {

    // What and Why?
    // built in function - it makes us to code easy.

    // ques- a to the power b.
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter base : ");
        int n =sc.nextInt();
        System.out.print("Enter power : ");
        int m =sc.nextInt();
        int power=1;
        for(int i=1;i<=m;i++){
            power*=n;
        }
        System.out.println(n+" raise to the power "+m+" is "+power);
    }
}