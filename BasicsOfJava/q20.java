import java.util.Scanner;

public class q20 {
    // Given a point (x,y), WAP to find out if it lies on the x-axis, y-axis or at the origin(0,0).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("origin");
        }
        else if (x==0){
            System.out.println("y-axis");
        }
        else if (y==0){
            System.out.println("x-axis");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
