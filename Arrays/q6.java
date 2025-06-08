public class q6 {
    // Find the second largest element in the given Array.

    public static void main(String[] args) {
        int[] arr= {12,3,65,45,87,8,13};
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maximum<arr[i]){
                maximum = arr[i];
            }
        }
        int sec_maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sec_maximum<arr[i] && arr[i]!=maximum){
                sec_maximum = arr[i];
            }
        }
        System.out.println(sec_maximum);
    }
}
