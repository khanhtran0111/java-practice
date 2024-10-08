import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner scanner = new Scanner(System.in);
        int numSentences = Integer.parseInt(scanner.nextLine());
        for(int i=0; i < numSentences; i++) {
            String input = scanner.nextLine();
            Matcher m = p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        scanner.close();
    }
}