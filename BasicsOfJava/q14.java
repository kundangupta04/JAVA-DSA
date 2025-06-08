import java.util.Scanner;

public class q14 {
    // TAke 3 numbers input and tell if they can be the sides of a triangle .a

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of the Triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter second side of the Triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter third side of the Triangle : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("All the 3 numbers can be the sides of a triangle.");
        }
        else{
            System.out.println("All the 3 numbers cannot be the sides of the triangle. ");
        }
    }
}
