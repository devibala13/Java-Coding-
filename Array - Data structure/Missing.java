import java.util.Scanner;

public class Missing {
    public static int Miss_No(int n1,int arr[])
    {
        int sum=0;
        int n = n1+1;
        int avg = (n*(n+1))/2;
        for(int i=0;i<n1;i++)
        {
            sum+=arr[i];
        }
        int no = avg - sum;
        return no;

    }
    public static void main(String [] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int no = Miss_No(n, arr);
        System.out.println("The missing no is:"+no);
    }
}
