class Frequency {
    public static void main(String[] args) {
        // char[] arr = {'A','A','A','B','B','C','C','A','B','A','C','C','D','A','A'};
        int[] arr = {1,2,3,4,5,1,2,3,4,5,6};
        int n = arr.length;

        int[] frequency = new int[100];
        for (int num : arr) {
            frequency[num]++;
        }
        System.out.println("Element : Frequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " : " + frequency[i]);
    }
}
    }
}