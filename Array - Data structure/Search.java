import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int k,n,i,flag=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter a key to search:");
        k = s.nextInt();
        System.out.println("The position of the key is:");
        for( i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(i+1);
        }
        else{
            System.out.println("The key is not found");
        }
    }
}
