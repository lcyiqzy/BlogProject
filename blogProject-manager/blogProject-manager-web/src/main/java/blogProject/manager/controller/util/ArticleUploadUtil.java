package blogProject.manager.controller.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArticleUploadUtil {

    public static String upload(HttpServletRequest request, HttpServletResponse response, String directoryName,
            String upload) {
        String fileUrl = "";
        // 获得上传路径的绝对路径地址
        String realPath = request.getSession().getServletContext().getRealPath("/" + directoryName);
        System.out.println(realPath);
        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + ".html";
        fileUrl = realPath + "\\" + fileName;
        
        File file = new File(fileUrl);

        BufferedWriter bw = null;
        try {
            // 创建字符输出流实例，同时打开指定文件
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            // 读取指定文件内容
            // 将内容写入指定文件
            bw.write(upload);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        String articleRealContextPath = fileUrl + "&" +request.getContextPath() + "/" + directoryName + fileName;
        return articleRealContextPath;
    }
    
    public static void writeFile() {
        
    }
}
