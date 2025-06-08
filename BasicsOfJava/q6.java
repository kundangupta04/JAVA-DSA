import java.util.Scanner;

public class q6 {
    // Given the length and breadth of a rectangle, WAP to find whether the area of the reactangle is greater than its perimeter.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the rectangle : ");
        int l = sc.nextInt();
        System.out.print("Breadth of the rectangle : ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);

        if(area>perimeter){
            System.out.println("The area of the rectangle is greater than its perimeter.");
        }
        else if(area == perimeter){
            System.out.println("The area of the rectangle is equal to its perimeter.");
        }
        else{
            System.out.println("The area of the rectangle is not greater than its perimeter.");
        }
    }
}
