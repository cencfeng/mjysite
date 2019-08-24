package com.fashion.mjysite.service;

import com.fashion.mjysite.entity.Atta;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    String fileUpload(MultipartFile file);
    byte[] getByteFile(String path);
    String saveFile(MultipartFile file) throws IOException;
    List<Atta> getFileByformCode(String formcode);
}
