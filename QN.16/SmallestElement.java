import java.util.Arrays;
import java.util.Scanner;

class KthSmallestElement {
    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);  // Sort array in ascending order
        return arr[k - 1];  // Return k-th smallest element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        if (k > 0 && k <= n) {
            int result = findKthSmallest(arr, k);
            System.out.println("The " + k + "-th smallest element is: " + result);
        } else {
            System.out.println("Invalid value of k!");
        }

        sc.close();
    }
}
