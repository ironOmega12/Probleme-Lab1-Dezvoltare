import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int average = 0;
        int sum = 0;
        int ctr = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // for (int i = 0; i < numbers.length; i++) {
        //     sum += numbers[i];
        //     ctr++;
        // }
        for (int nr : numbers) {
            sum += nr;
            ctr++;
        }
        average = sum / ctr;

        System.out.println(average);
        sc.close();
    }
}
