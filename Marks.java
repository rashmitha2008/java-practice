import java.util.Scanner;

class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks: ");
        int marks = sc.nextInt();
        if (marks>=40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
 
}