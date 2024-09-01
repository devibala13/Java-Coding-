import java.util.Scanner;

public class Max_min{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] arr = new int[n];
        int max=-1,min=999;
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element is :" + max);
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The maximum element is :" + min);
    }
}