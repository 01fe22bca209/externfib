public class fib2 extends Fib {
    public static void main(String[] args) {
        int n = 10;
        int f = 0;
        int s = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(f);
            int next = f + s;
            f = s;
            s = next;

        }

    }
}
