import java.util.*;
public class oddpat{
    public static void main(String [] args)
    {
        String odd;
        Scanner sc = new Scanner(System.in);
        odd = sc.nextLine();
        char [] arr = odd.toCharArray();
        int n = odd.length();
        int n1 = n;
        System.out.println(n1);
        for(int i=0;i<=n/2;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
            for(int j=1;j<n1;j++)
            {
                System.out.print(" ");
            
            }
            if(i!=n/2)
                System.out.println(arr[i]);
            n1 = n1-2;
        }
        System.out.print("\n");
        for(int i=(n/2)+1;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
            for(int j=0;j<=(i-n/2)*2-1;j++)
            {
                System.out.print(" ");
            
            }
            System.out.println(arr[i]);
            n1 = n1-2;
        }


    }
}