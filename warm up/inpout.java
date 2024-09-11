import java.util.*;

public class inpout {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double c = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + c);
        System.out.println("Int: " + a);
    }
}
