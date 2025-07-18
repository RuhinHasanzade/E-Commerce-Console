package az.commerce.util;

import java.util.Scanner;

public class MenuUtil {

    public static void startMenu() {
        while (true) {
            System.out.println("""
                    1. LOGIN
                    2. REGISTER
                    3. SHOW PRODCUT
                    4. EXIT
                    """);

            int selectedNum = InputUtil.getInt("Zehmet Olmasa secin:");


            if (selectedNum ==1){
                System.out.println("Login basladi");
            } else if (selectedNum ==2) {
                System.out.println("Register Basladi");
            } else if (selectedNum == 3) {
                System.out.println("Produclar");
            } else if (selectedNum == 4) {
                System.out.println("Exit....");
                break;
            }

        }
    }


}
