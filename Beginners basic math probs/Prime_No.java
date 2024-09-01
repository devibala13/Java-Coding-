import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        int n,flag=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no to check:");
        n = s.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0){
                System.out.println("Not a prime Number");
                flag = 1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
        
    }
}
