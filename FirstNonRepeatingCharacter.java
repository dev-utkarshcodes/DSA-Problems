import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char[] arr = {'A','A','A','B','B','C','C','A','B','A','C','C','D','A','A'};

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char c : arr) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating
        char result = '\0';
        for (char c : arr) {
            if (freq.get(c) == 1) {
                result = c;
                break;
            }
        }

        if (result != '\0')
            System.out.println("First non-repeating character is: " + result);
        else
            System.out.println("No non-repeating character found");
    }
}