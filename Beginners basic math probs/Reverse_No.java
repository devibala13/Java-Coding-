import java.util.Scanner;

public class Reverse_No{
    public static void main(String[] args) {
        int n,rev=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        while(n!=0)
        {
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println("The reversed number is:"+rev);
    }
}