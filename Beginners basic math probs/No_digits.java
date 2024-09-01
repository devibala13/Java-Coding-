import java.util.Scanner;

public class No_digits {
    public static void main(String[] args) {
        long n;
        int cnt=0;
        System.out.println("Enter a no:");
        Scanner s = new Scanner(System.in);
        n = s.nextLong();
        while(n!=0)
        {
            n = n/10;
            cnt++;
        }
        System.out.println("No of digits:"+cnt);

    }
}
