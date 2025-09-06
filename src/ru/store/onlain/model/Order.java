package ru.store.onlain.model;

import ru.store.onlain.model.enumeration.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

    private User user;

    private Address address;

    private BigDecimal totalPrice;

    private LocalDateTime orderDateTime;

    private OrderStatus orderStatus;

    private CartItem[] cartItemArray;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public CartItem[] getCartItemArray() {
        return cartItemArray;
    }

    public void setCartItemArray(CartItem[] cartItemArray) {
        this.cartItemArray = cartItemArray;
    }
}
