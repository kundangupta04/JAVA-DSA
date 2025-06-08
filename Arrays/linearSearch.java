import java.util.Scanner;
public class linearSearch {
    // Find the element 'x' in the array. Take array and x as input.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.print("Enter array : ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter x : ");
        int x =sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag = true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element Found");
        }
    }
}
