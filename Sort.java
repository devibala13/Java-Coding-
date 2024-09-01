import java.util.Arrays;
public class Sort {
    public static void main(String[] args)
    {
        int i,ind1=0,ind2=0;
        int [] ip = {1,3,2,5,4,7,10};
        int [] odd = new int[10];
        int [] even = new int[10];
        for(i=0;i<ip.length;i++)
        {
            if(ip[i]%2!=0)
            {
                odd[ind1] = ip[i];
                ind1++;
            }
            else{
                even[ind2]=ip[i];
                ind2++;
            }
        }
        Arrays.sort(odd,0,ind1);
        Arrays.sort(even,0,ind2);
        for(i=ind1;i>=0;i--)
        {
            System.out.print(odd[i]+" ");
        }
        for(i=0;i<ind2;i++)
        {
            System.out.print(even[i]+" ");
        }
    }
}
