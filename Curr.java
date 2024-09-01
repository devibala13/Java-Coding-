public class Curr {
    public static void main(String [] args)
    {
        int ip = 2456;
        int i=0;
        int [] curr = {2000,500,200,100,50,20,10,5,1};
        int [] ind = {0,0,0,0,0,0,0,0,0};
        while(ip>0)
        {
            if(ip>=curr[i])
            {
                ip = ip - curr[i];
                ind[i]++;
            }
            else{
                i++;
            }
        }
        for(i=0;i<curr.length;i++)
        {
            if(ind[i]>0)
            {
                System.out.println(curr[i] + ":" + ind[i]);
            }

        }
    }
}
