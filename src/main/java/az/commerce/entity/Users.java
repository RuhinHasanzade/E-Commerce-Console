package az.commerce.entity;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private String userName;
    private String password;
    private List<Product> cart = new ArrayList<>();

    public Users() {

    }

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
//        this.cart = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", cart=" + cart;
    }
}
