package com.example.demo.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/file")
public class FileContoller {

    // 单文件上传
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam(value="fileName")MultipartFile file) {
        if (file!=null) {
            String filename = file.getOriginalFilename();
            System.out.println("文件的名称" +filename);
            System.out.println("文件的大小："+file.getSize());//字节
            //时间戳做文件的名字
            long currentTimeMillis = System.currentTimeMillis();
            File fileSourec = new File("E:\\test\\"+currentTimeMillis+".pdf");
            System.out.println(fileSourec.getAbsolutePath());
            if (!fileSourec.exists()) {
                try {
                    fileSourec.createNewFile();
                    FileCopyUtils.copy(file.getBytes(), fileSourec);
                } catch (IOException e) {
                    e.printStackTrace();
                    return "上传失败：失败原因："+e.getMessage();
                }
            }
        }
        return "上传成功！！！";
    }
    
    //多文件上传
    @RequestMapping("/uploadFiles")
    @ResponseBody
    public String uploadFiles(MultipartHttpServletRequest request) {
        List<MultipartFile> files = request.getFiles("fileName");
        for (MultipartFile multipartFile : files) {
            String fileName = multipartFile.getOriginalFilename();
            long fileSize = multipartFile.getSize();
            System.out.println("文件的名称："+fileName+"----文件的大小："+fileSize);
        }
        return "上传成功！！！";
    }
}
