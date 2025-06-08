 public class initialization{
    public static void main(String[] args) {
        int[] arr = {76,88,13,82,83};
        for(int i=0;i<=4;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr[2]=23;
        for(int i=0;i<=4;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr2 = new int[7];
        for(int i=0;i<7;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        arr2[0]=13;
        arr2[1]=32;
        arr2[2]=45;
        arr2[3]=03;
        arr2[4]=30;
        arr2[5]=98;
        arr2[6]=17;
        for(int i=0;i<7;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        
        int arr3[] = {12,02,23,3,56,456,78,0123,159,0211,203};
        System.out.println(arr3.length);
        int n=arr3.length;
        for(int i=0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }
}