class Frequency {
    public static void main(String[] args) {
        char[] arr = {'A','A','A','B','B','C','C','A','B','A','C','C','D','A','A'};
        int n = arr.length;

        int[] freq = new int[26];

        
        for (int i = 0; i < n; i++) {
            freq[arr[i] - 'A']++;
        }
        System.out.println("Element\tFrequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'A') + "\t" + freq[i]);
            }
        }
    }
}