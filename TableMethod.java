class TableMethod {
    static int table(int num) {
        for(int i=1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        return 0;
    }
    public static void main(String args[]) {
        int num=8;
        TableMethod.table(num);
    }
}