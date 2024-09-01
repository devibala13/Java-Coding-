import java.util.*;
public class Odd_Even
{
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}