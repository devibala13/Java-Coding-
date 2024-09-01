import java.util.Arrays;
public class Pat{
    public static void main(String[] args){
        int [] ip = {131,11,48};
        int [] arr = new int[40];
        int [] n = new int[20];
        int i,j,ind = 0;
        for(i=0;i<ip.length;i++){
            int temp = ip[i];
            while(temp!=0)
            {
                arr[ind] = temp%10;
                temp = temp/10;
                ind++;
            }
            
        }
        int ind1=0;
        for(i=0;i<ind;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(arr[i] == arr[j] && i==j)
                {
                    n[ind1] = arr[i];
                    ind1++;
                }
                else if(arr[i]==arr[j])
                {
                    break;
                }
            }
        }
        Arrays.sort(n,0,ind1);
        for(i=0;i<ind1;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}