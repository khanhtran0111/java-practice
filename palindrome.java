import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String res = new StringBuilder(s).reverse().toString();
        if(s.compareTo(res) == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        scanner.close();
    }
}
