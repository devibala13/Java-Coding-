
import java.util.*;
public class all_patterns {
    public static void main(String[] args)
    {
        int r,c,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        n = s.nextInt();
        for(r=1;r<=n;r++)
        {
            for(c=1;c<=n;c++)
            {
                if(c<=n-r)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }
    }
}
