import java.util.*;

public class loop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i < 3; i++){
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.print(s1);
            for(int j=0; j < 15 - s1.length(); j++){
                System.out.print(" ");
            }
            if(x < 10){
                System.out.print("00"+x);
            } else if(x < 100 && x >= 10){
                System.out.print("0"+x);
            }
            else{
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println("================================");
        scanner.close();
    }
}
