class LargestNumberMethod {
    static int checkLargestNumber(int arr[]) {
        int max = arr[0];
    for(int i=1; i<arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
    }
    public static void main(String args[]) {
        int arr[] = {12, 36,57,78,43};
        int result = checkLargestNumber(arr);
        System.out.println("The largest number is: " + result);
    }    
}