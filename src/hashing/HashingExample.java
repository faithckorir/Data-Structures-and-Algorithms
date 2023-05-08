package hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String input = "hello world";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(input.getBytes());
        String hashValue = bytesToHex(digest);
        System.out.println("Hash value: " + hashValue);
    }

    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
