import java.util.Scanner;
public class Sort_01 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of 0's, 1's and 2's:");
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
        System.out.println("The sorted array:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
