package blogProject.manager.controller.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DeleteUtil {

    public static void deleteFile(String article, String picture) {
        List<String> delUrl = new ArrayList<>();
        delUrl.add(article);
        
        if (!(picture == null) && !(picture == "")) {
            String[] urls = picture.split("&");
            for (String string : urls) {
                delUrl.add(string);
            }
        }
        
        for (String url : delUrl) {
            File file = new File(url);
            if(file.isFile() && file.exists()){
                Boolean succeedDelete = file.delete();
                if(succeedDelete){
                    System.out.println("成功删除单个文件"+url);
                }
                else{
                    System.out.println("失败删除单个文件"+url);
                }
            }else{
                System.out.println("文件不存在，删除单个文件"+url+"失败！");
            }
        }
    }
}
