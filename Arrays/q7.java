import java.util.Scanner;

public class q7 {
    // Count the number of elements in given array greater than a given number x.

    public static void main(String[] args) {
        int[] arr={15,45,32,69,87,69};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
