import java.util.*;

class diagnoldif{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        int tong1 = 0;
        int tong2 = 0;
        for(int i=0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    tong1 = tong1 + a[i][j];
                }
            }
        }
        int i = 0;
        int j = n-1;
        while(i < n && j >= 0){
            tong2 = tong2 + a[i][j];
            i = i+1;
            j = j-1;
        }
        int kqua = Math.abs(tong1-tong2);
        System.out.println(kqua);
    }
}