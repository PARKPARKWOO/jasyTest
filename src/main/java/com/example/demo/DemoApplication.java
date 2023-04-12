package com.example.demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        StandardPBEStringEncryptor pbeStringEncryptor = new StandardPBEStringEncryptor();
        pbeStringEncryptor.setAlgorithm("PBEWithMD5AndDES");
        pbeStringEncryptor.setPassword("test");

        String enc = pbeStringEncryptor.encrypt("database-2.czi3rshsccn1.us-east-2.rds.amazonaws.com");
        System.out.println("enc = " + enc);
        String admin = pbeStringEncryptor.encrypt("admin");
        String qorwns1234 = pbeStringEncryptor.encrypt("qorwns1234");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("====server start====");
    }



}
