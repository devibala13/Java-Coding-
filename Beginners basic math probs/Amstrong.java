import java.util.Scanner;

public class Amstrong {
    public static int powerfn(int rem,int cnt){
        int ans = 1;
        for(int i=0;i<cnt;i++)
        {
            ans*=rem;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n,n1,res=0,cnt=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        n = s.nextInt();
        n1 = n;
        while(n1!=0)
        {
            cnt++;
            n1 = n1/10;
        }
        n1 = n;
        while(n1!=0)
        {
            int rem = n1%10;
            res = res+powerfn(rem,cnt);
            n1=n1/10;
        }
        if(res == n)
        {
            System.out.println("It is a amstrong number");
        }
        else{
            System.out.println("It is not a amstrong number");
        }
        
    }
}
