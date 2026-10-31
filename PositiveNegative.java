import java.util.Scanner;
class PositiveNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println(" the " + num + " is positive ");
        } else if(num < 0) {
            System.out.println(" the " + num + " is negative ");
        } else {
            System.out.println(" the " + num + " is zero ");
        }
        sc.close();
    }
}