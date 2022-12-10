package com.tobias.orderservice.inner.service;

import com.tobias.orderservice.outer.dto.OrderInfoPutRequest;
import com.tobias.orderservice.outer.dto.OrderInfoRequest;
import com.tobias.orderservice.outer.dto.OrderInfoResponse;

import java.util.List;

public interface OrderInfoService {

    void orderInfoRequest(OrderInfoRequest orderInfoRequest);

    List<OrderInfoResponse> orderInfoResponse(long userid);

    void orderInfoPutRequest(OrderInfoPutRequest orderInfoPutRequest);

    void orderInfoDelete(long destinationInfoid);

}