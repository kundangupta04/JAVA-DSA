import java.util.Scanner;

public class q7 {
    // Take input of length and breadth of rectangle , tell if it is square or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the Rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth of the Rectangle : ");
        int b = sc.nextInt();
        if(l==b){
            System.out.println("The given Rectangle is a square.");
        }
        else{
            System.out.println("The given Rectangle is not a square.");

        }
    }
}
