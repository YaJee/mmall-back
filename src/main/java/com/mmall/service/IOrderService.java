package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

import java.util.Map;

/**
 * Created by yajie on 2019/5/26.
 */
public interface IOrderService {


    ServerResponse createOrder(Integer userId, Integer shippingId);

    ServerResponse<String> cancel(Integer userId,Long orderNo);

    ServerResponse getOrderCartProduct(Integer userId);

    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);




    ServerResponse pay(Long orderNo, Integer userId, String path);

    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);


    ServerResponse aliCallback(Map<String,String> params);

}
