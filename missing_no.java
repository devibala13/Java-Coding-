import java.util.Scanner;

public class missing_no {
    public static int missing(int arr[])
    {
        int n = arr.length + 1 ;
        int sum = 0;
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
            sum += arr[i];
        }
        int sum_exp = (min+max) * n/2;
        return sum_exp - sum;
    }
    public static void main(String[] args) {
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int miss = missing(arr);
        System.out.println("The missing no is:"+miss);
    }
}
