package com.sample.orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ecommerce")
public class OrderController {

    @RequestMapping(value = "/order/test", method= RequestMethod.GET)
    public String order() {
        return "Request serving from Order Service!";
    }

    
}
