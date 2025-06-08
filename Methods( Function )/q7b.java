import java.util.Scanner;

public class q7b {


    public static void swap(int a,int b){ // here a & b are formal parameters (boxes)
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First number : "+a);
        System.out.println("Second number : "+b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        System.out.print("Enter first num : ");
        int a=sc.nextInt();
        System.out.print("Enter second num : ");
        int b=sc.nextInt();
        swap(a,b); // And, here a & b are actual parameters (values)
    }
}
