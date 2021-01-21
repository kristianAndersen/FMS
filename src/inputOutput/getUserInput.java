package inputOutput;

import java.util.Scanner;
import java.util.regex.*;

public class getUserInput {

    public String userInputChars(Scanner scanner) {
        String userinputchars = scanner.next();

        Pattern p = Pattern.compile("^[a-zA-Z]*$");
        Matcher m = p.matcher(userinputchars);
        if (m.find()) {
            return userinputchars;
        } else {
            return "Z";
        }

    }

    public int userInputNum(Scanner scanner) {

        String userinputnum = scanner.next();

        Pattern p = Pattern.compile("^[1-9]|[1-9][0-9]|[1-9][0-9][0-9]*$");
        Matcher m = p.matcher(userinputnum);
        if (m.find()) {
            return Integer.parseInt(userinputnum);
        } else {
            return 999;
        }

    }

}
