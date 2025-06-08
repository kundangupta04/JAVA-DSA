public class predict {

    // predict the output

    public static void main(String[] args) {

        // //1
        // int x = 1;
        // while (x == 1)
        //     x = x - 1;
        // System.out.println(x);


        // //2
        // while ('a'<'b') {
        //     System.out.println("malayalam is is a palindrome");
        // }

        //3
        int x = 4, y=0;
        while (x>=0) {
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }
    }
}