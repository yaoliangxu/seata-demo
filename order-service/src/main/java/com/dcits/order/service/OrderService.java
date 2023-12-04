package com.dcits.order.service;

import com.dcits.order.entity.Order;

public interface OrderService  {

    /**
     * 创建订单
     */
    Long create(Order order);
}