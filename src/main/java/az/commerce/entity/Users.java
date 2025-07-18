package az.commerce.entity;

import java.util.List;

public class Users {
    private String userName;
    private String password;
    private List<Product> cart ;

    public Users() {

    }

    public Users(String userName, String password, List<Product> car) {
        this.userName = userName;
        this.password = password;
        this.cart = car;
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
}
