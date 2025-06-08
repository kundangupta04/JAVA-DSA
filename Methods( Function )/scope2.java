public class scope2 {
    
    static int i; // Global Variable
    public static void main(String[] args) {
        i=0;
        System.out.println(i);
        int i=23; // Local Variable 
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
        int i =70; // Local Variable
        System.out.println(i);
    }
}
