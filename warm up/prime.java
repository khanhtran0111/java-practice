import java.util.Scanner;
import java.math.BigInteger;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}