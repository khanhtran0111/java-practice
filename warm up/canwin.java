import java.util.*;

public class canwin {
    
    public static boolean check(int leap, int[] game, int i){
        if(i < 0 || game[i] == 1){
            return false;
        }
        if(i + 1 >= game.length || i + leap >= game.length){
            return true;
        }
        game[i] = 1; //make a move
        return check(leap, game, i+1) || check(leap, game, i-1) || check(leap, game, i + leap);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int t=0; t < q; t++){
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[n];
            for(int i=0; i < n; i++){
                game[i] = scanner.nextInt();
            }
            boolean flag = check(leap, game, 0);
            if(flag == true){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
