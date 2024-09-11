import java.util.*;

public class subarr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int dem = 0;
        for(int i=0; i < n; i++){
            int x = scanner.nextInt();
            a[i] = x;
            if(x < 0){
                dem = dem + 1;
            }
        }
        scanner.close();
        int[] subar = new int[n];
        subar[0] = a[0];
        for(int i=1; i < n; i++){
            subar[i] = subar[i-1] + a[i];
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                int lmao = subar[j] - subar[i] + a[i];
                if(lmao < 0){
                    dem = dem + 1;
                }
            }
        }
        System.out.print(dem);
    }

}
