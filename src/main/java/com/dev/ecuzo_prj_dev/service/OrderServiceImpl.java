package com.dev.ecuzo_prj_dev.service;

import com.dev.ecuzo_prj_dev.jpa.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    private OrdersRepository ordersRepository;

    @Autowired
    public OrderServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }
}
