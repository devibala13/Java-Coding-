import java.util.Scanner;
public class Rot_by_k {
    public static void main(String[] args) {
        int n,temp,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter k to rotate:");
        k = s.nextInt();
        for(int i=0;i<k;i++)
        {
            temp = arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        System.out.println("After rotation:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
