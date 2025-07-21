package az.commerce.database;

import az.commerce.entity.Product;
import az.commerce.entity.Users;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Users> usersList = new ArrayList<>();
    public static List<Product> productList = new ArrayList<>();

    public static Users currentUser = null;

    static
    {
        productList.add(new Product(1,"Ipone 13",2000));
        productList.add(new Product(2,"ASUS",2000));
        productList.add(new Product(3,"RAZER",300));
    }



}
