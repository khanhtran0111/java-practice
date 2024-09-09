import java.util.*;

public class substring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String k = s.substring(a, b);
        System.out.print(k);
        scanner.close();
    }
}
