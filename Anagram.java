public class Anagram {
    public static boolean isAnagram(String s,String t)
    {
        // Firstly we check the frequency of both are equal or not because if not then they can't be anagram.
        if(s.length() != t.length())
        {
            return false;
        }
        // Create an arrray to count the freqeuencies of characters assuming only lowercase(a-z).
        int[] charcount = new int[26];
        // Increament(++) count for each char in s.
        // Decrement(--) count for each cchar in t.
        for(int i=0;i<s.length();i++)
        {
            charcount[s.charAt(i)-'a']++;
            charcount[t.charAt(i)-'a']--;
        }
        // Check if all count are 0 if yes then true else means no anagram or false.
        for (int i : charcount) {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s= "car";
        String t= "tac";
        boolean result = isAnagram(s,t);
        if (result)
        {
            System.out.println("Anagram");
        }
        else{
                System.out.println("Not Anagram");
            }
    }
}
