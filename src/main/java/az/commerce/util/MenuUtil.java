package az.commerce.util;

import az.commerce.database.DataBase;
import az.commerce.entity.Product;
import az.commerce.entity.Users;

import java.util.List;
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
                userLogin();
            } else if (selectedNum ==2) {
                userRegister();
            } else if (selectedNum == 3) {
                showProducts();
            } else if (selectedNum == 4) {
                System.out.println("Exit....");
                break;
            }

        }
    }


    private static void userRegister() {
        System.out.println("--------------REGISTER--------------");
        String username = InputUtil.getStr("Enter Username: ");
        String password = InputUtil.getStr("Enter Password: ");

        Users user =  new Users(username,password);

        DataBase.usersList.add(user);
        System.out.println("--------------SUCCESFULL--------------");
        System.out.println(DataBase.usersList);
    }

    private static void userLogin() {
        System.out.println("--------------LOGIN--------------");
        String username = InputUtil.getStr("Enter Username: ");

        List<Users> usersList = DataBase.usersList;

        for(Users user : usersList) {
            if (user.getUserName().equals(username)) {
                String password = InputUtil.getStr("Enter Password: ");
                if (user.getPassword().equals(password)) {
                    System.out.println("--------------SUCCESFULL--------------");
                }else {
                    System.out.println("Parol Yalnisdir");
                    return;
                }
            }else {
                System.out.println("Istifadechi Tapilmadi");
                return;
            }
        }
    }


    private static void showProducts() {
       List <Product> productList =  DataBase.productList;
        System.out.println("--------------Products--------------");

        System.out.println(productList);
    }


}
