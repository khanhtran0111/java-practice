import java.util.*;

public class arr{
    static int[] solve(int[] grades){
        for(int i=0; i < grades.length; i++){
            if(grades[i] >= 38){
                int m = 5 - (grades[i] % 5) + grades[i];
                if(m - grades[i] < 3){
                    grades[i] = m;
                }
            }
        }
        return grades;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] grades = new int[n];
        for(int i=0; i < n; i++){
            grades[i] = sc.nextInt();
        }
        int[] res = solve(grades);
        for(int i=0; i < res.length; i++){
            System.out.print(res[i] + (i != res.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        sc.close();
    }

}