import java.util.Scanner;

public class Last_dig {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int last = n%10;
        System.out.println("The last digit is:"+last);
    }
}
