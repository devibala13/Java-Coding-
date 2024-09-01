import java.util.Scanner;

public class Two_Eq {
    public static void main(String[] args) {
        int n1,n2,i,j,flag=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n1 = s.nextInt();
        System.out.println("Enter a number:");
        n2 = s.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("Enter elements of 1st array:");
        for(i=0;i<n1;i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter elements of 1st array:");
        for(i=0;i<n2;i++)
        {
            arr2[i] = s.nextInt();
        }
        if(n1!=n2)
        {
            System.out.println("The two arrays are not equal.");
        }
        else{
        for(i=0;i<n1-1;i++)
        {
            for(j=i+1;j<n1;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(i=0;i<n2-1;i++)
        {
            for(j=i+1;j<n2;j++)
            {
                if(arr2[i]>arr2[j])
                {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for(i=0;i<n1;i++)
        {
            if(arr1[i]==arr2[i])
            {
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("The two arrays are equal.");
        }
        else{
            System.out.println("The two arrays are not equal.");
        }
    }
    }
}
