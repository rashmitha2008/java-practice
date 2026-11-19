class FactorialMethod {
    static int factorial(int num) {
        int fact=1;
        for(int i=1; i<=num; i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]) {
        int num=8;
        int result = FactorialMethod.factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}