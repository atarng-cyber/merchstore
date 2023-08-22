package com.swift.merchstore.controller;

import com.swift.merchstore.common.ApiResponse;
import com.swift.merchstore.dto.CheckoutItemDto;
import com.swift.merchstore.service.AuthenticationService;
import com.swift.merchstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    // stripe create session API
/*    @PostMapping("/create-checkout-session")
    public ResponseEntity<ApiResponse> checkoutList(@RequestBody List<CheckoutItemDto> checkoutItemDtoList) {
        // create the stripe session
        Session session = orderService.createSession(checkoutItemDtoList);
        StripeResponse stripeResponse = new StripeResponse(session.getId());
        // send the stripe session id in response
        return new ResponseEntity<ApiResponse>(stripeResponse, HttpStatus.OK);
    }*/
}