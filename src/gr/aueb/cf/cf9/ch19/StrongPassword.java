package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {

        String s = "C0dingF@ct0ry"; //at least 8 chars, at least one lower case

        // at least 12 chars, at least 1 lower case
        // 1 uppercase 1 digit 1 special character
        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{12,}"); //zero-length assertion
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
