package Java_Coding_Question_50;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {
    public static void main(String[] args) {
        String pattern="mm-dd-yyyy";

        SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
        String date= dateFormat.format(new Date());

        System.out.println(date);
    }
}

