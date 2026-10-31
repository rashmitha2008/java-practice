import java.util.Scanner;
class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.println("your age is: " + age);
        sc.close();
    
    }
}