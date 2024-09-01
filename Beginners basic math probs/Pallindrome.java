import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        int n,i,n1,rem,rev=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        n1 = n;
        while(n1!=0)
        {
            rem = n1%10;
            rev = rev*10 + rem;
            n1 = n1/10;
        }
        if(rev == n)
        {
            System.out.println("The number is pallindrome");
        }
        else{
            System.out.println("The number is not a pallindrome");
        }
    }
}
