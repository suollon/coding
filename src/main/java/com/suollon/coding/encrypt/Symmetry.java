package com.suollon.coding.encrypt;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.DES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

public class Symmetry {

    public static void main(String[] args) {
        des();
        try {
            System.out.println(InetAddress.getLocalHost());
            System.out.println(Inet4Address.getLocalHost().getHostAddress());
            System.out.println(Inet6Address.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    /**
     * 在 Java 中用 DES 加密有一个特殊的地方：
     * 1. 秘钥设置的长度必须大于等于 8 字节。
     * 2. 秘钥设置的长度如果大于 8 的话，那么只会取前 8 个字节作为秘钥。
     */
    public static void des() {
        String content = "要加密的字符串";
        byte[] desKey1 = SecureUtil.generateKey(SymmetricAlgorithm.DES.getValue(), "12345678".getBytes()).getEncoded();
        byte[] desKey2 = SecureUtil.generateKey(SymmetricAlgorithm.DES.getValue(), "1234567800".getBytes()).getEncoded();
        byte[] desKey3 = SecureUtil.generateKey(SymmetricAlgorithm.DES.getValue(), "123456780000".getBytes()).getEncoded();
        DES des1 = SecureUtil.des(desKey1);
        DES des2 = SecureUtil.des(desKey2);
        DES des3 = SecureUtil.des(desKey3);
        String encryptHex = des1.encryptHex(content);
        System.out.println(encryptHex);
        System.out.println(des2.encryptHex(content));
        System.out.println(des3.encryptHex(content));
        System.out.println("============");
        System.out.println(des1.decryptStr(encryptHex, Charset.forName("UTF-8")));
    }

    /**
     * 秘钥的可以由我们自己定义，也可以是由AES自己生成，当自己定义是需要是要注意：
     * 1. 根据 AES 规范，可以是 16 字节、24 字节和32 字节长，分别对应 128 位、192 位和 256 位；
     * 2. 为便于传输，一般对加密后的数据进行 base64 编码
     */
    public static void aes() {

    }
}
