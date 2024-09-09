import java.util.*;

public class cal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=1; i <= t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            for(int k=0; k <= n-1; k++){
                int tong = 0;
                for(int j=0; j <= k; j++){
                    tong += Math.pow(2, j) * b;
                }
                tong = tong+ a;
                System.out.print(tong +" ");
            }
            System.out.println();
        }
        scanner.close();
    }
} 