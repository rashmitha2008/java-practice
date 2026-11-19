class PrintMethod {
    static int display(int n) {
        return n;
    }
    static void display(String name) {
        System.out.println("Hello, " + name);
    }
    public static void main(String args[]) {
        int num=10;
        String name= "Ashu";
        int result1 = PrintMethod.display(num);
        PrintMethod.display(name);
        System.out.println("The integer is: " + result1);
    }
}