import java.util.Scanner;

public class q21 {
    // Given the coordinates (x, y) of a center of a circle and its radius , WAP which will determine whether a point lies inside , on the circle or outside the circle.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        System.out.println("Enter y: ");
        int y=sc.nextInt();
        System.out.println("Enter radius");
        int r =sc.nextInt();
        System.out.println("Enter x: ");
        int x1=sc.nextInt();
        System.out.println("Enter y: ");
        int y1=sc.nextInt();
        int oa = (x-x1)*(x-x1) + (y-y1)*(y-y1);
        if(oa*oa>r*r){
            System.out.println("OUtside");
        }
        else if(oa*oa<r*r){
            System.out.println("Inside");
        }
        else{
            System.out.println("on the circle.");
        }
    }
}
