import java.util.HashSet;

class Duplicate
{
    public static boolean containDuplicate(int []nums)
    {
        //Create a HashSet to store the values
        HashSet<Integer> seenNumbers = new HashSet<>();
        // Iterate through the elements  in the array
        for (int num : nums) {
            //  Check wheather the element present in the hashSet or not in time complexity O(1)
            if(seenNumbers.contains(num))
            {
                return true;
            }
            // if not present in the HashSet then add element into the HashSet
            seenNumbers.add(num);
        }
        // if not matched in complete iteration means no duplicate found 
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,4,1,5};
        boolean result = containDuplicate(nums);
        if (result)
        {
            System.out.println("Duplicate Found");
        }
        else{
                System.out.println("Duplicate not Found");
            }
    }
}