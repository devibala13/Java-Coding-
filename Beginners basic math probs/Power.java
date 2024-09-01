import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int n,pow,no=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no ");
        n = s.nextInt();
        System.out.println("Give the power:");
        pow = s.nextInt();
        for(int i=0;i<pow;i++)
        {
            no *= n;
        }
        System.out.println("The power of given no is:"+no);
    }
}
