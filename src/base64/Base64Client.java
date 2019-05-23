package base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Client {

    public static void main(String[] args) {
        String text = "deiveehan";
        System.out.println("text = " + text);
        String encodedStr = encode(text);
        System.out.println("encodedStr = " + encodedStr);

        byte[] decodedStr = decode(encodedStr);
        System.out.println("decodedStr = " + new String(decodedStr));
    }

    private static String encode(String text) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] decode(String text) {
        Base64.Decoder decoder = Base64.getDecoder();
        return decoder.decode(text);
    }
}
