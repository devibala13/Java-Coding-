import java.util.*;
public class AnagramCheck{
    public static boolean areAnagrams(String a, String b){
        if(a.length()!=b.length())
        {
            return false;
        }
        int [] charCount = new int[26];
        for(int i=0;i<a.length();i++)
        {
            charCount[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            charCount[b.charAt(i)- 'a']--;
        }
        for(int count:charCount)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string:");
        String a = s.nextLine();
        System.out.println("Enter second string:");
        String b = s.nextLine();
        if(areAnagrams(a,b))
        {
            System.out.println("The strings are anagram");
        }
        else{
            System.out.println("The strings are not anagram");
        }
        s.close();;
    }
}