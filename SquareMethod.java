class SquareMethod {
        public static int square(int n) {
            return n*n;
        }
    }
    public static void main(String args[]) {
        int number=5;
        int result = SquareMethod.square(number);
        System.out.println("The square of the number is : " + result);
}
