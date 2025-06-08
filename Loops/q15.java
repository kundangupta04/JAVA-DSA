public class q15 {
    // WAP to print odd numbers from 1 to 100.

    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            if(i%2==0) continue;
            System.out.print(i+" ");
        }
    }
}
