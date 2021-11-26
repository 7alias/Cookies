package chars;

public class length {

    public static void length() {
        String s = "hello world";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
