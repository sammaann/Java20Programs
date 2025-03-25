class ClosestToZero {
    public static void findClosestSum(int arr[]) {
        int left = 0, right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                num1 = arr[left];
                num2 = arr[right];
            }

            if (sum < 0) left++;  
            else right--;         
        }

        System.out.println("Numbers closest to zero sum: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        int arr[] = {-10, -3, 2, 4, 7, 11}; 
        findClosestSum(arr);
    }
}
