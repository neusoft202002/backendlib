package com.hit.neuruimall.controller;

import com.hit.neuruimall.service.IImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ImgController {

    @Autowired
    private IImgService imgService;

    @GetMapping("/getImgUrl")
    public List<String> getImgUrl() {
        return imgService.getImgUrl();
    }

    @PostMapping("/uploadImg")
    public boolean uploadImg(MultipartFile file) throws IOException {
        imgService.uploadImg(file);
        return true;
    }
}
