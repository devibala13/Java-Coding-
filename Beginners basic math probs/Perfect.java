import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int n,i,n1,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        n1 = n;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum += i;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
