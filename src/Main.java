public class Main {
    public int getSum(int f,int a) {
        if (f <= a) {
            return a;
        }
        else {
            return f + getSum(f - 1,a);
        }
    }
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.getSum(10,5));
    }
}
