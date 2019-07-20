package com.fashion.mjysite.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Md5Util {
    private static String salt;
    @Value("${md5.enpt.salt}")
    public void setSalt(String salt) {
        Md5Util.salt = salt;
    }
    public static String encrypt(Object ciptext){
        String hashAlgorithmName = "MD5";
        int hashIterations = 2;
        ByteSource salt1 = ByteSource.Util.bytes(salt);
        String result = new SimpleHash(hashAlgorithmName, ciptext, salt1, hashIterations).toBase64();
        return result;
    }

}
