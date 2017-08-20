package blogProject.restapi.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @ClassName: ImageUploadUtil
 * @Description: 图片上传工具类，
 */
public class ImageUploadUtil {

    // 图片类型
    private static List<String> fileTypes = new ArrayList<String>();

    static {
        fileTypes.add(".jpg");
        fileTypes.add(".jpeg");
        fileTypes.add(".bmp");
        fileTypes.add(".gif");
        fileTypes.add(".png");
    }

    /**
     * 图片上传
     */
    public static String upload(HttpServletRequest request, String DirectoryName)
            throws IllegalStateException, IOException {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        
        String fileRealPath = null;
        if (multipartResolver.isMultipart(request)) {
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;

            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {

                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {

                    String myFileName = file.getOriginalFilename();
                    if (myFileName.trim() != "") {
                        String originalFilename = file.getOriginalFilename();
                        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
                        if (!fileTypes.contains(suffix)) {
                            continue;
                        }
                        
                        String realPath = request.getSession().getServletContext().getRealPath("/" + DirectoryName);
                        System.out.println(realPath);
                        File realPathDirectory = new File(realPath);
                        if (realPathDirectory == null || !realPathDirectory.exists()) {
                            realPathDirectory.mkdirs();
                        }
                        
                        String fileName = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10)+ "_file_"
                                + originalFilename;
                        fileRealPath = realPathDirectory + "\\" + fileName;
                        File uploadFile = new File(fileRealPath);
                        System.out.println(uploadFile);
                        file.transferTo(uploadFile);
                        fileRealPath = fileRealPath + "&" + fileName;
                    }
                }
            }
        }
        return fileRealPath;
    }

    /**
     * ckeditor文件上传功能，回调，传回图片路径，实现预览效果。
     * 
     */
    public static String ckeditor(HttpServletRequest request, HttpServletResponse response, String DirectoryName)
            throws IOException {
        String fileRealPath = upload(request, DirectoryName);
        String[] split = fileRealPath.split("&");
        String fileName = split[1];
        // 结合ckeditor功能
        // imageContextPath为图片在服务器地址，非绝对路径
        String imageContextPath = request.getContextPath() + "/" + DirectoryName + fileName;
        response.setContentType("text/html;charset=UTF-8");
        String callback = request.getParameter("CKEditorFuncNum");
        PrintWriter out = response.getWriter();
        out.println("<script type=\"text/javascript\">");
        out.println("window.parent.CKEDITOR.tools.callFunction(" + callback + ",'" + imageContextPath + "',''" + ")");
        out.println("</script>");
        out.flush();
        out.close();
        return split[0];
    }
}
