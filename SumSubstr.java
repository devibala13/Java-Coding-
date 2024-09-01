import java.util.Scanner;

public class SumSubstr {
    public static void sumSeq(int arr[],int n,int sum)
    {
        int j,i,nsum=0;
        for(i=0;i<n;i++)
        {
            
            nsum = arr[i];
            for(j=i+1;j<=n;j++){
            if(nsum==sum)
            {
                System.out.println("It starts at "+ (i+1) + "and ends at " + j);
                return;
            }
            if(nsum > sum || j == n)
                break;
            nsum = nsum + arr[j];
            }
        }
        System.out.println("-1");

    }
    public static void main(String[] args)
    {
        
        int n,i,sum;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no :");
        n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter values :");
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter sum :");
        sum = s.nextInt();
        sumSeq(arr, n, sum);
        
    }
}
