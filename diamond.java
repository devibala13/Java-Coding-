import java.util.*;
public class diamond {
    public static void main(String[] args){
    int r,c,n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter no of rows");
    n = s.nextInt();   
    for(r=1;r<=n;r++)
    {
        for(c=1;c<=n-r;c++)
        {
            System.out.print(" ");
        }
        for(c=1;c<=2*r-1;c++)
        {
            //System.out.print("*");     //Diamond pattern
            if(c<=r)
            {
                System.out.print(c);
            }
            else{
                System.out.print(2*r-c);
            }
                

            
        }
        System.out.println("\n");
    }
    for(r=n-1;r>=1;r--)
    {
        for(c=1;c<=n-r;c++)
        {
            System.out.print(" ");
        }
        for(c=1;c<=2*r-1;c++)
        {
            //System.out.print("*"); //Diamond pattern
            if(c<=r)
            {
                System.out.print(c);
            }
            else{
                System.out.print(2*r-c);
            }
        }
        System.out.println("\n");
    }

    } 
}
