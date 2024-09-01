import java.util.*;

public class reverse {
    public static void main(String[] args) {
        String a;
        int i,n;
        char temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any string:");
        a = s.nextLine();
        char [] arr = a.toCharArray();
        n = a.length();
        for(i=0;i<n/2;i++)
        {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        String str = new String(arr);
        System.out.println("The reversed array is:"+str);
        s.close();
    }
}
