public class q8 {
    // Find the doublet in the Array whose sum is equal to the given value of x.(Two Sum)

    public static void main(String[] args) {
        int[] arr = {12,21,38,69,74,83};
        int x = 81;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==81){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
