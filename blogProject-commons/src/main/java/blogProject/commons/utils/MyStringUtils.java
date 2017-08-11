package blogProject.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyStringUtils {

    public static String formatSimpleDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        return format;
    }
    
    
    public static boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }

        if (str.trim().equals("")) {
            return true;
        }
        
        return false;
    }

}