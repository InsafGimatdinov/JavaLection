public class lib {
    static void sayHi() {
        System.out.println("Hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }
}
