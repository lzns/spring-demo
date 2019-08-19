package com.example.demo.web;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;
import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.MultimediaObject;

@RestController
@RequestMapping("/audioRepair")
@Slf4j
public class AudioRepairController {

    @RequestMapping(value = "/repair", method = RequestMethod.POST)
    public /*ResultVO*/void repair(@RequestParam(value="fileName")MultipartFile mpFile) {
        try {
            List<Map<String,String>> message = null;
            if (mpFile!=null) {
                String fileName = mpFile.getOriginalFilename();
                if (fileName != null && fileName.length() > 0) {
                    System.out.println(fileName);
                    String sufix = fileName.substring(fileName.lastIndexOf('.'));
                    long fileSize = mpFile.getSize();
                    byte[] ll = mpFile.getBytes();
                    File file = new File("aa"+sufix);
                    FileCopyUtils.copy(ll, file);
                    log.info("文件二进制流的大小:{}----文件的大小：{}",ll.length,fileSize);
                    System.out.println("文件的名称："+file.getName()+"----文件的大小："+fileSize);
                    EncodingAttributes attribute = new EncodingAttributes();
                    AudioAttributes autido = new AudioAttributes();
                    autido.setSamplingRate(new Integer(16000));
                    autido.setChannels(new Integer(1));
                    autido.setCodec("pcm_s16le");
                    File outFile = new File("test.pcm");
                    attribute.setAudioAttributes(autido);
                    attribute.setFormat("s16le");
                    Encoder encoder = new Encoder();
                    try {
                        encoder.encode(new MultimediaObject(file), outFile, attribute);
                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                    //message = voice();
                }  
//                return ResultVOUtil.success(message);
            }
//            return ResultVOUtil.error(408, "上传文件为空，请重新上传语音文件！");
        }catch (Exception e) {
            e.printStackTrace();
//            return ResultVOUtil.error(e,"上传失败！");
        } finally {
        }
    }

    /*private static List<Map<String, String>> voice() {
        NLPService nlpService = new NLPService();
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        if (!nlpService.init("nlp.yaml")) {
            return list;
        }
        NLPResponse nlpResponse = nlpService.sendAudio("test.pcm");
//        NLPResponse nlpResponse = nlpService.sendAudio(audio);
        if (nlpResponse == null) {
            System.out.println("语义理解失败");
            Map<String,String> map = new HashMap<String,String>();
            map.put("desc", "语义理解失败");
            list.add(map);
            return list;
        }
        if (!nlpResponse.getCode().equals("0")) {
            System.out.println("失败原因" + nlpResponse.getDesc());
            Map<String,String> map = new HashMap<String,String>();
            map.put("desc", "失败原因" + nlpResponse.getDesc());
            list.add(map);
            return list;
        }
        for (Data data : nlpResponse.getData()) {
            System.out.println("sub " + data.getSub());
            System.out.println("text " + data.getText());
            if (data.getSub().equals("nlp")) {
                if (data.getIntent() == null) {
                    System.out.println("intent is null");
                } else {
                    System.out.println("rc = " + data.getIntent().getRc());

                    if (data.getIntent().getText() == null) {
                        System.out.println("intent is {}");
                    } else {
                        if (data.getIntent().getSemantic() != null &&  data.getIntent().getSemantic().length > 0) {
                            for (Semantic semantic : data.getIntent().getSemantic()) {
                                Map<String,String> map = new HashMap<String,String>();
                                for (Slot slot : semantic.getSlots()) {
                                    map.put(slot.getName(), slot.getValue());
                                    System.out.println("intent " + slot.getName() + ":" + slot.getValue());
                                }
                               list.add(map); 
                            }
                            if (data.getIntent().getMoreResults() !=null && data.getIntent().getMoreResults().length > 0) {
                                for (MoreResults moreResults : data.getIntent().getMoreResults()) {
                                    for (Semantic semantic : moreResults.getSemantic()) {
                                        for (Slot slot : semantic.getSlots()) {
                                            System.out.println("moreResults " + slot.getName() + ":" + slot.getValue());
                                        }
                                    }
                                }
                            }
                        }
                    }//end if
                }//end if
            }//end if nlp
        }//end for
        return list;
    }*/
}
