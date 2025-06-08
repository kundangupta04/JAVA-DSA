public class pass_args {

    public static void greet(String name){
        System.out.println("Good Morning " +name);
    }
    public static void main(String[] args) {
        sum(2,80,-56);
        greet("sir");
        greet("Piyush");
    }
    public static void sum(int a, int b, int c){
        System.out.println("sum is "+(a+b+c));
    }
}