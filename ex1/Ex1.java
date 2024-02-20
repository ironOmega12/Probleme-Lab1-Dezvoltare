import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Negativ");
        } else {
            System.out.println("pozitiv");
        }
        sc.close();
    }
}