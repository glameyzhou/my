package org.glamey.myidea.radix;

import java.io.IOException;

/**
 * @author by zhouyang.zhou.
 */
public class RadixMain {

    public static void main(String[] args) throws IOException {
        byte[] bytes = intToByte(332);
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        System.out.println("---------------------");
        int integer = byteToInt(bytes);
        System.out.println(integer);

    }

    private static int byteToInt(byte[] bytes) {
        int integer = 0;
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            integer += (int) ((bytes[i] & 0xFF) << ((length - 1 - i) * 8));
        }
        return integer;
    }

    private static byte[] intToByte(int i) {
        byte[] bytes = new byte[4];
        int length = bytes.length;
        for (int j = 0; j < length; j++) {
            bytes[j] = (byte) ((i >> ((length - 1 - j) * 8)) & 0xFF);
        }
        return bytes;
    }
}
