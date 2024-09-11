import java.util.*;

public class string {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String ss1 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        String ss2 = s2.substring(0,1).toUpperCase() + s2.substring(1);
        int lmao = s1.length() + s2.length();
        System.out.println(lmao);
        if(s1.compareTo(s2) <= 0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(ss1 + " " + ss2);
        scanner.close();
    }
}
