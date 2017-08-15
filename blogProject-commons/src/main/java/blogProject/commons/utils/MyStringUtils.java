package blogProject.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName MyStringUtils
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author WzzAdmin
 * @Date 2017年8月11日 下午4:12:17
 * @version 1.0.0
 */
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