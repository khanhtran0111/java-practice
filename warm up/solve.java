import java.util.*;

public class solve {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = b*h;
            System.out.println(area);
        }
        scanner.close();
    }
}
