import java.util.ArrayList;
import java.util.Scanner;

public class intersection {
    public static int[] intersectionfn(int [] arr1, int [] arr2)
    {
        ArrayList <Integer> intersect = new ArrayList<>();
        for(int i =0 ;i<arr1.length;i++)
        {
            for(int j = 0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    if(!intersect.contains(arr1[i]))
                    {
                        intersect.add(arr1[i]);
                    }
                    break;
                }
                
            }
        }
        int [] finarr = new int[intersect.size()];
        for(int i=0;i<intersect.size();i++)
        {
            finarr[i] = intersect.get(i);
        }
        return finarr;
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n1:");
        n1 = s.nextInt();
        int [] arr1 = new int[n1];
        for(int i = 0; i<n1;i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("Enter n2:");
        n2 = s.nextInt();
        int [] arr2 = new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i] = s.nextInt();
        }
        int [] intersect = intersectionfn(arr1,arr2);
        System.out.println("Intersection of two arrays:");
        for(int i : intersect)
        {
            System.out.println(i);
        }
    }
}
