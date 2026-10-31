class Main1 {
    public static void main(String args[]) {
        int arr[] = {12, 45, 23, 67, 37};
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the largest number is :" + max);
    }
}