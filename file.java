import java.util.*;

public class file {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while(scanner.hasNextLine()){
            String str=scanner.nextLine();
            if (str.contains("end-of-file")){
                i++;
                System.out.println(i+" "+str);
                break;
            }else{
                i++;
                System.out.println(i+" " +str);       
            }
        }  
        scanner.close();
    }
}