package org.lanqiao.controller;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;

/**
 * Created by andy on 2017/9/8.
 */
@Controller
@RequestMapping("/upload")
public class UoloadController {
    @RequestMapping("/image.do")
    public void upload(@RequestParam("file")CommonsMultipartFile file){
        try {
            //获取文件名称
            String fileName = file.getOriginalFilename();
            //写入本地磁盘
            InputStream is = file.getInputStream();
            byte[] bs = new byte[1024];
            int len;
            OutputStream os = new FileOutputStream(new File("C:/temp/" + fileName));
            while ((len = is.read(bs)) != -1){
                os.write(bs , 0 ,len);
            }
            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
