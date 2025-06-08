import java.util.Scanner;

public class q5 {
    // If cost price and selling price of an item is input through the keyboard, WAP to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price of The product : ");
        int cp=sc.nextInt();
        System.out.print("Enter selling price of The product : ");
        int sp=sc.nextInt();
        if(cp<sp){
            int profit = sp-cp;
            System.out.println("The seller has made profit of Rs: "+profit);
        }
        else if(cp>sp){
            int loss = cp-sp;
            System.out.println("The seller has made loss of rs: "+loss);
        }
        else{
            System.out.println("The seller has made no loss no profit");
        }
    }
}
