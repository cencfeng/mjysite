package com.fashion.mjysite.service.Impl;

import com.fashion.mjysite.entity.Atta;
import com.fashion.mjysite.entity.FastDFSFile;
import com.fashion.mjysite.mapper.AttaMapper;
import com.fashion.mjysite.service.FileService;
import com.fashion.mjysite.util.FastDFSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private AttaMapper attaMapper;
    @Override
    public String fileUpload(MultipartFile file) {
        return null;
    }

    @Override
    public byte[] getByteFile(String path) {
        try {
            InputStream inputStream = new FileInputStream(path);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            return buffer;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Override
    public String saveFile(MultipartFile multipartFile) throws IOException {
        String[] fileAbsolutePath={};
        String fileName=multipartFile.getOriginalFilename();
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        byte[] file_buff = null;
        InputStream inputStream=multipartFile.getInputStream();
        if(inputStream!=null){
            int len1 = inputStream.available();
            file_buff = new byte[len1];
            inputStream.read(file_buff);
        }
        inputStream.close();

        FastDFSFile file = new FastDFSFile(fileName, file_buff, ext);
        try {
            fileAbsolutePath = FastDFSClient.upload(file);  //upload to fastdfs
        } catch (Exception e) {
            System.out.println("upload file Exception!");
        }
        if (fileAbsolutePath==null) {
            System.out.println("upload file failed,please upload again!");
        }
        String path= FastDFSClient.getTrackerUrl()+fileAbsolutePath[0]+ "/"+fileAbsolutePath[1];
        return path;
    }

    @Override
    public List<Atta> getFileByformCode(String formcode) {
        return attaMapper.getFileByformCode(formcode) ;
    }
}
