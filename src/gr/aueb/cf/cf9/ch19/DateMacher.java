package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * The inpunt string includes dates in US format mm/dd/yyy.
 * The program regnognize all the dates in the string and
 * transform to GR dates.
 */


public class DateMacher {


    public static void main(String[] args) {
        String date = "06/12/2024; aaabbbbb 11/05/1999 xxx";

        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()){

            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            // String grDate = String.format("%s/%s/%s, day, month, year");
            String grDate = day + "/" + month + "/" + year;
            System.out.println(grDate);

        }
    }
}
