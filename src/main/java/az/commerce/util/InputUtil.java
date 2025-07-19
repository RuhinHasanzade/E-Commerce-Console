package az.commerce.util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String text) {
        System.out.print(text);
        return sc.nextInt();
    }

    public static String getStr(String text) {
        System.out.print(text);
        return sc.next();
    }
}
