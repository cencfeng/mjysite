package com.fashion.mjysite.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    String fileUpload(MultipartFile file);
    byte[] getByteFile(String path);
    String saveFile(MultipartFile file) throws IOException;
}
