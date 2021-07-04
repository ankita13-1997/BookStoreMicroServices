package com.microusers.bookservice.service;



import com.microusers.bookservice.model.BookCartDetails;

import java.util.List;

public interface IOrderService {

    String placeAnOrder(Double totalPrice, String token);

    List<BookCartDetails> getAllOrders(String token);
}
