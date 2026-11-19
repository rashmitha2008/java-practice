class MultiplyMethod {
    static int multiply(int a, int b) {
        return a*b;
    }
    static int multiply(int a,int b,int c) {
        return a*b*c;
    }
    public static void main(String args[]) {
        int result1 = MultiplyMethod.multiply(8 , 5);
        System.out.println("The Multiplication of two numbers is: " + result1);
        int result2 = MultiplyMethod.multiply(8 , 5, 2);
        System.out.println("The Multiplication of three numbers is: " + result2);
    }
}