import java.util.Scanner;

public class q4 {
    // Take integer input and print the absolute value of that integer.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ent er an integer:  "); 
        int n = sc.nextInt();
        if(n<0){
            n = n*(-1);
            System.out.print("The absolute value is : "+n);
            // System.out.println(n);
        }
        else{
            System.out.print("The absolute value is : "+n);
            // System.out.println(n);
        }
    }
}
