package com.microusers.bookservice.service;



import com.microusers.bookservice.dto.CouponDto;
import com.microusers.bookservice.model.Coupons;

import java.util.List;

public interface ICouponService {

    Coupons addCouponsToDatabase(CouponDto couponDto);

    List<Coupons> fetchCoupon(String token, Double totalPrice);

    Double addCoupon(String token, String coupon, Double totalPrice);
}
