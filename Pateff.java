import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
public class Pateff {
    public static void main(String[] args){
    int [] ip = {131,11,48,97};
    
    Set<Integer> dist = new HashSet<>();

    for(int i:ip)
    {
        while(i>0)
        {
            dist.add(i%10);
            i = i/10;
        }
    }
    int [] res = new int[30];
    int ind1=0;
    for(int num : dist)
    {
        res[ind1] = num;
        ind1++;
    }
    Arrays.sort(res);
    for(int i : res)
    {
        System.out.print(res[i]+" ");
    }
    }
}
