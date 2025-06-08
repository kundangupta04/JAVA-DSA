import java.util.Scanner;

public class q12 {
    // Take 3 positive integers input and print the greatest of them.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second integer : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third integer : ");
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println(n1+" is greatest of them"); 
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+" is greatest of them");
        }
        else{
            System.out.println(n3+" is greatest of them");

        }
    }
}
