package com.fashion.mjysite.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fashion.mjysite.entity.User;
import com.fashion.mjysite.service.FileService;
import com.fashion.mjysite.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @Autowired
    private UserService userService;

    @Value("${file.upload.localpath}")
    private String fileUploadpath;
    @Value("${file.virtual.path}")
    private String virPath;
    @RequestMapping("/uploadfaceimg")
    @ResponseBody
    public JSONObject uploadFaceImg(@RequestParam("file")MultipartFile file) throws IOException {
        // TODO Auto-generated method stub
        Date date = new Date();
        JSONObject result = new JSONObject();
        //List<Upfile> list=new ArrayList<Upfile>();
        //项目根路径参数为classpath或空时,获取到的是classes根目录
        File classPath = new File(ResourceUtils.getURL(fileUploadpath).getPath());
        if(!file.isEmpty())
        {
            String filename=file.getOriginalFilename();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String strDate = sdf.format(date);
//            String fileno=strDate+filename.hashCode();
            String prefix=filename.substring(filename.lastIndexOf("."));
            //绝对唯一的标准规范路径名,识别出../等
            String serverPath = classPath.getCanonicalPath() + "/" + strDate + prefix;
            String savePath = virPath.substring(0,virPath.length()-2) + strDate + prefix;
//            System.out.println(serverPath);
            File f = new File(serverPath);
            //File virF = new File(savePath);
            System.out.println(f.getParentFile());
            if(!f.getParentFile().exists())
            {
                System.out.println(f.getParentFile() + "creat");
                f.getParentFile().mkdirs();
//                System.out.println(f.getAbsolutePath());
            }
            if(f.exists()){
                f=new File(fileUploadpath+strDate+"-1"+prefix);
//                System.out.println(f.getAbsolutePath());
            }
            file.transferTo(f);
            User user = (User) SecurityUtils.getSubject().getPrincipal();
            userService.updateFaceImg(user.getUsername(), savePath);
            //upfileMapper.saveFile(enfile);
            //list.add(upfile);
            //throw new NullPointerException("±àºÅÎª¿Õ");
            result.put("data", "success");
            result.put("url",savePath);
        }
        return result;
    }
//        字节流图片显示方式
//    @RequestMapping("/getfilebytetest")
//    @ResponseBody
//    public String getFileByteTest(HttpServletRequest request, HttpServletResponse response, Model model, String userName){
//        FileInputStream fis = null;
//        OutputStream os = null;
//        System.out.println(userName);
//        try {
//            fis = new FileInputStream("../fileupload/files/20190713112306.jpg");
//            os = response.getOutputStream();
//            int count = 0;
//            byte[] buffer = new byte[1024 * 8];
//            while ((count = fis.read(buffer)) != -1) {
//                os.write(buffer, 0, count);
//                os.flush();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            fis.close();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "success";
//    }
    //fastDFS 文件服务器
    @RequestMapping("/uploadfaceimg2")
    @ResponseBody
    public JSONObject singleUploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes){
        JSONObject result = new JSONObject();
        String path = null;
        if(file.isEmpty()){
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            result.put("data", "fail");
            result.put("url", "");
            return result;
            //return "redirect:uploadStatus";
        }
        try {
            path = fileService.saveFile(file);
            User user = (User) SecurityUtils.getSubject().getPrincipal();
            userService.updateFaceImg(user.getUsername(), path);
            result.put("data", "success");
            result.put("url",path);
//            redirectAttributes.addFlashAttribute("message",
//                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
//            redirectAttributes.addFlashAttribute("path",
//                    "file path url '" + path + "'");
        }catch (Exception ex){
            System.out.println(ex);
        }
        return result;
    }
}
