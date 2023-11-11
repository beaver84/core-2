package com.example.core2.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}