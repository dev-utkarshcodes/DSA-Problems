import java.util.*;

class Knapsac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt(); 
        System.out.println("Enter The capacity of bag:");
        int W = sc.nextInt(); 

        int wt[] = new int[n];

        System.out.println("Enter the Weight in the array:");

        for (int i = 0; i < n; i++) {
            
            wt[i] = sc.nextInt();
        }

         System.out.println("Enter the value in the array:");

        int val[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        System.out.println(fun(wt, val, W, n));
    }

    public static int fun(int wt[], int val[], int W, int n) {
        if (n == 0 || W == 0)
            return 0;
        if (wt[n - 1] > W)
            return fun(wt, val, W, n - 1);
        else
            return Math.max(val[n-1]+fun(wt, val, W - wt[n - 1], n - 1) , fun(wt, val, W, n - 1));
    }
}