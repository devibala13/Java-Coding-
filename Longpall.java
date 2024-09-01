public class Longpall {
    public static String longPall(String s)
    {
        int n = s.length();
        if(n==0)
            return " ";
        boolean[][] dp = new boolean[n][n];
        int i,j,k;
        int st = 0,maxlen = 1;
        for(i=0;i<n;i++)
        {
            dp[i][i] = true;
        }
        for(i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                dp[i][i+1] = true;
                st = i;
                maxlen = 2;
        }
        for(k=3;k<=n;k++)
        {
            for(i=0;i<n-k+1;i++)
            {
                j = i+k-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
                {
                    dp[i][j] = true;
                    
                    if(k>maxlen)
                    {
                        st = i;
                        maxlen = k;
                    }
                }
            }
        }
        return s.substring(st,st+maxlen);

    }
    public static void main(String[] args)
    {
        String str = "forgeeksskeegfor";
        System.out.println("The longest pallindrome is:"+ longPall(str));
    }
}
