import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int alice = 0;
        int bob = 0;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0; i < n; i++){
            b[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] > b[i]){
                alice = alice + 1;
            }
            else if(b[i] > a[i]){
                bob = bob + 1;
            }
        }
        scanner.close();
        System.out.print(alice + " " + bob);
    }
}