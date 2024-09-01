import java.util.Scanner;

public class GCD {
    public static int Find_GCD(int a,int b){
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int n1,n2;
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        int gcd = Find_GCD(n1,n2);
        System.out.println("The gcd of the number is:"+gcd);
    }
}
