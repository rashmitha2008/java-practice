class ShowMethod {
    static void show(int a,String b) {
        System.out.println("The integer is: " + a);
        System.out.println("The string is: " + b);
    }
    static void show(String a,int b) {
         System.out.println("The string is: " + a);
         System.out.println("The integer is: " + b);
    }
    public static void main(String args[]) {
        int num=100;
        String name = "Ashu";
        ShowMethod.show(num,name);
        ShowMethod.show(name,num);
    }
}