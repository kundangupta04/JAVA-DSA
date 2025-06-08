public class scope {
    // Scope of Variables

    static int i; // global variable
    
    public static void main(String[] args) {
        for(i=1;i<=11;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("* "+i+" *"); 
        fun();
    }
    public static void fun(){
        i =20;
        System.out.println(i);
    }
}
