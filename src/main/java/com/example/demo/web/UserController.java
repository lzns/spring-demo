package com.example.demo.web;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.MultimediaObject;


@RestController
@RequestMapping("/user")
public class UserController {
    private final static Logger log = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("getAllUser")
    public List<User> getAllUsre() {
        List<User> allUser = userService.getAllUser();
        System.out.println(allUser);
        log.info(allUser.toString());
        return allUser;
    }
    @RequestMapping("addUser")
    public String addUser() {
        User user = new User();
        user.setName("mark"+new Random().nextInt());
        user.setCreateDate(new Date());
        int addUser = userService.addUser(user);
        log.info("添加用户返回影响的行数：{}",addUser);
        if (addUser==1) { 
            return "添加用户成功！！！";
        }else {
            return "添加用户失败！！！";
        }
    }
    @RequestMapping("updateUser")
    public String updateUser() {
        List<User> allUser = userService.getAllUser();
        User user = allUser.get(2);
        user.setName("maliya"+new Random().nextInt());
        //user.setName(null);
        int addUser = userService.updateUser(user);
        log.info("更新用户的个数：{}",addUser);
        if (addUser>=1) {
            return "更新用户成功！！！";
        }else {
            return "更新用户失败！！！";
        }
    }
    public static void main(String[] args) throws Exception {
        
        EncodingAttributes attribute = new EncodingAttributes();
        AudioAttributes autido = new AudioAttributes();
        Encoder encoder = new Encoder();
        File file = new File("D:\\test.amr");
        //转换成mp3
        autido.setSamplingRate(new Integer(16000));
        autido.setChannels(new Integer(1));
        autido.setCodec("pcm_s16le");
        attribute.setFormat("s16le");
        attribute.setAudioAttributes(autido);
        File file2 = new File("test.pcm");
        encoder.encode(new MultimediaObject(file), file2, attribute);
        System.out.println("執行結束！");
    }
}
