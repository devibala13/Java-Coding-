import java.util.*;
import java.util.Arrays;
public class anagram{
    public static boolean anagrams(String a,String b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = s.nextLine();
        System.out.println("Enter second string:");
        String b = s.nextLine();
        if(anagrams(a,b))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        s.close();
    }

}