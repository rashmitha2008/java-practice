class EvenOddMethod {
    static void checkevenodd(int num) {
        if(num%2==0){
            System.out.println("the number is even: " + num);
        } else {
            System.out.println("the number is odd: " + num);
        }
    } 
    public static void main(String args[]) {
        int number=5;
        EvenOddMethod.checkevenodd(number);
    }
}