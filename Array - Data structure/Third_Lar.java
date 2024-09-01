import java.util.Scanner;

public class Third_Lar{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number:");
        n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i =0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Third largest element:");
        System.out.println(arr[2]);
    }
}