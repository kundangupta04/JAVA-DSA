public class return_type2 {
    public static void greet(int time) {
        if(time<12)
        System.out.println("Good Morning");
        else
        System.out.println("Good Afternoon");
    }
    public static void main(String[] args) {
        greet(13);
    }
}
