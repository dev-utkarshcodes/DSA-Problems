import java.util.*;

class Partition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt(); 

        int arr[] = new int[n];   

        System.out.println("Enter the elements in the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }

        System.out.println(fun(arr));
    }

    public static boolean fun(int arr[]) {

        int s = 0;
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            s += arr[i];
        }

        if (s % 2 == 0) {
            s /= 2;
            return subset(arr, l, s);
        } else
            return false;
    }

    public static boolean subset(int arr[], int l, int s) {

        if (s == 0)
            return true;

        if (l == 0)
            return false;

        if (arr[l - 1] > s)
            return subset(arr, l - 1, s);

        else
            return subset(arr, l - 1, s - arr[l - 1]) || subset(arr, l - 1, s);
    }
}
