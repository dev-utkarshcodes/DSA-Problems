import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Frequency {
    
    // Method that takes array as input and returns ArrayList of frequency pairs
    public static ArrayList<String> getFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            result.add(entry.getKey() + " : " + entry.getValue());
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // Create ArrayList and add elements
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println("Element : Frequency");
        ArrayList<String> frequencies = getFrequency(arr);
        for (String freq : frequencies) {
            System.out.println(freq);
        }
    }
}