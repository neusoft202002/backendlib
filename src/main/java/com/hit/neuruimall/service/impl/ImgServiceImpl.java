package com.hit.neuruimall.service.impl;

import com.hit.neuruimall.service.IImgService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ImgServiceImpl implements IImgService {

    @Value("${imgPath}")
    private String imgPath;

    @Override
    public List<String> getImgUrl() {
        List<String> imgNames = new ArrayList<>();
        File file = new File(imgPath);
        File[] itemFile = file.listFiles();
        for (File file1 : itemFile) {
            imgNames.add("http://localhost:8888/" +file1.getName());
        }
        return imgNames;
    }

    @Override
    public void uploadImg(MultipartFile multipartFile) throws IOException {
        File dist = new File(imgPath + multipartFile.getOriginalFilename());
        multipartFile.transferTo(dist);
    }
}
