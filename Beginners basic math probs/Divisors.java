import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
