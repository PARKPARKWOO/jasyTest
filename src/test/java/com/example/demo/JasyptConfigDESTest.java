//package com.example.demo;
//
//import org.bouncycastle.jce.provider.BouncyCastleProvider;
//import org.jasypt.encryption.StringEncryptor;
//import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class JasyptConfigDESTest {
//    @Test
//    public void jasypt_암호화_복호화() {
//        // given
//        String mysqlURL = "jdbc:mysql://database-2.czi3rshsccn1.us-east-2.rds.amazonaws.com:3306/bsa?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
//        String mysqlUserName = "admin";
//        String mysqlPassword = "qorwns1234";
//
//        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//        encryptor.setProvider(new BouncyCastleProvider());
//        encryptor.setPoolSize(2);
//        encryptor.setPassword("qorwns");
//        encryptor.setAlgorithm("PBEWithSHA256And128BitAES-CBC-BC");
//
//        // when
//        String encryptedTextMysqlURL = encryptor.encrypt(mysqlURL);
//        System.out.println("mysqlURL 암호화 값 : " + encryptedTextMysqlURL);
//
//        String encryptedTextMysqlUserName = encryptor.encrypt(mysqlUserName);
//        System.out.println("mysqlUserName 암호화 값 : " + encryptedTextMysqlUserName);
//
//        String encryptedTextMysqlPassword = encryptor.encrypt(mysqlPassword);
//        System.out.println("mysqlPassword 암호화 값 : " + encryptedTextMysqlPassword);
//
//        String decryptedTextMysqlURL = encryptor.decrypt(encryptedTextMysqlURL);
//        String decryptedTextMysqlUserName = encryptor.decrypt(encryptedTextMysqlUserName);
//        String decryptedTextMysqlPassword = encryptor.decrypt(encryptedTextMysqlPassword);
//
//        // then
////        assertThat(mysqlURL).isEqualTo(decryptedTextMysqlURL);
////        assertThat(mysqlUserName).isEqualTo(decryptedTextMysqlUserName);
////        assertThat(mysqlPassword).isEqualTo(decryptedTextMysqlPassword);
//    }
//
//}