package codepage;

import java.nio.charset.StandardCharsets;

public class GolovachCodePage {

    public static void main(String[] args) {
        String str = new String(new byte[] {0, 1, 2});
        System.out.println(str);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);

        System.out.println("A".getBytes(StandardCharsets.UTF_16).length);
        System.out.println("AA".getBytes(StandardCharsets.UTF_16).length);
    }
}
