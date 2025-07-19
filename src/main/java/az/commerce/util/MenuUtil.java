package az.commerce.util;

import az.commerce.database.DataBase;
import az.commerce.entity.Users;

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
                System.out.println("Login");
            } else if (selectedNum ==2) {
                userRegister();
            } else if (selectedNum == 3) {
                System.out.println("Produclar");
            } else if (selectedNum == 4) {
                System.out.println("Exit....");
                break;
            }

        }
    }


    private static void userRegister() {
        String username = InputUtil.getStr("Enter Username: ");
        String password = InputUtil.getStr("Enter Password");

        Users user =  new Users(username,password);

        DataBase.usersList.add(user);
        System.out.println("--------------SUCCESFULL--------------");
        System.out.println(DataBase.usersList);
    }


}
