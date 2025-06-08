public class q5 {
    // Find the maximum value out of all the elements in the array.
    public static void main(String[] args) {
        int[] arr = {12,56,45,85,91,190};
        int maximum = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("Maximum = "+  maximum);
    }
}
