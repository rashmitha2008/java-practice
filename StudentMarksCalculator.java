import java.util.Scanner;
class StudentMarksCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
        sc.close();
    }
}