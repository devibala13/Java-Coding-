import java.util.Scanner;
public class Repeat_No {
    public static void main(String[] args) {
        int n,i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i] == arr[i+1])
            {
                System.out.println("Repeated no is:"+arr[i]);
            }
        }
    }
}
