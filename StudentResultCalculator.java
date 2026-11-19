class StudentResultCalculator {
    static int marks(int m1,int m2,int m3){
        return m1+m2+m3;
    }
    static double average(int marks){
        return marks/3.0;
    }
    static boolean isPassed(double average){
        if (average>=40){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        int totalMarks = marks(80, 70, 90);
        double averageMarks = average(totalMarks);
        boolean result = isPassed(averageMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("result: " + result);
    }
}
