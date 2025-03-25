import java.util.Scanner;

class BinarySearch {
    public static boolean search(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return true; 
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1; 
        }
        return false; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 15};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        if (search(arr, target)) 
            System.out.println(target + " is present in the array.");
        else 
            System.out.println(target + " is NOT present in the array.");
        
        sc.close();
    }
}
