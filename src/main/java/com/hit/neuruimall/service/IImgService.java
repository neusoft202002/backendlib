package com.hit.neuruimall.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IImgService {

    public List<String> getImgUrl();

    public void uploadImg(MultipartFile multipartFile) throws IOException;
}
