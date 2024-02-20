public class Ex3 {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int nr = 2;
        for (int i = 3; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(nr + " " + i);
                nr = i;
            }
        }
    }
}
