import java.util.Scanner;

public class Rot_by_1 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        int last = arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[n-1] = last;

        System.out.println("After rotation:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
