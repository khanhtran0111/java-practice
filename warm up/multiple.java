import java.util.*;

public class multiple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        for(int i=1; i <= 10; i++){
            int kq = x*i;
            System.out.println(x + " x " + i + " = " + kq);
        }
    }
}
