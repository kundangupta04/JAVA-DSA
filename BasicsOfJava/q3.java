import java.util.Scanner;
public class q3 {
    // Any year is input through keyboard. WAP to determine whether the year is a leap year or not.( considering leap year occurs after every 4 years)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("The given year is a leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }
}
