public class q4 {
    // Calculate the sum of all the elements in the given array.
    public static void main(String[] args) {
        int[] arr={32,45,65,98,65};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the given array = "+sum);
    }
}
