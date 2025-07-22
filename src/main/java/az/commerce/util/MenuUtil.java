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
                    4. SHOW CART
                    5. EXIT
                    """);

            int selectedNum = InputUtil.getInt("Zehmet Olmasa secin:");


            if (selectedNum ==1){
                userLogin();
            } else if (selectedNum ==2) {
                userRegister();
            } else if (selectedNum == 3) {
                showProducts();
            } else if (selectedNum == 4) {
                showCart();
            } else if (selectedNum == 5) {
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
        boolean found  = false;

        for(Users user : usersList) {
            if (user.getUserName().equals(username)) {
                String password = InputUtil.getStr("Enter Password: ");
                if (user.getPassword().equals(password)) {
                    System.out.println("--------------SUCCESFULL--------------");
                    DataBase.currentUser = user;
                    found = true;
                    break;
                } else {
                    System.out.println("Parol Yalnisdir");
                    return;
                }
            }
        }
            if (!found) {
                System.out.println("Istifadechi tapilmadi");
            }
    }


    private static void showProducts() {
       List <Product> productList =  DataBase.productList;
        System.out.println("--------------Products--------------");

        System.out.println(productList);

         int productId =  InputUtil.getInt("Mehsul secin: ");
         Product selectedPro = addToCart(productId);

         if(selectedPro != null && DataBase.currentUser != null ) {
             DataBase.currentUser.getCart().add(selectedPro);
             System.out.println("Mehsul Sebete elave olundu: " + selectedPro);
         } else  {
             System.out.println("Mehsul tapilmadi ve ya istifadechi login olmayb");
         }


    }


    private static Product addToCart(int id) {
        List <Product> productList =  DataBase.productList;

        for(Product product : productList) {
            if(product.getId() == id) {
                return product;
            }
        }

        return null;
    }


    private static void showCart() {

            if(DataBase.currentUser == null) {
                System.out.println("Login olun");
                return;
            }


        List<Product> cart = DataBase.currentUser.getCart();

        if (cart.isEmpty()) {
            System.out.println("Sebetiniz bosdur");
        } else  {
            for (Product product : cart) {
                System.out.println(product);
            }
        }
    }


}
