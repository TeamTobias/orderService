package com.tobias.orderservice.inner.impl;

import com.tobias.orderservice.inner.domain.OrderInfo;
import com.tobias.orderservice.inner.service.OrderInfoService;
import com.tobias.orderservice.outer.dto.OrderInfoPutRequest;
import com.tobias.orderservice.outer.dto.OrderInfoRequest;
import com.tobias.orderservice.outer.dto.OrderInfoResponse;
import com.tobias.orderservice.outer.repository.OrderInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderInfoServiceImpl implements OrderInfoService {

	private final OrderInfoRepository orderInfoRepository;



	@Override
	public void orderInfoRequest(OrderInfoRequest orderInfoRequest){

	}

	@Override
	public List<OrderInfoResponse> orderInfoResponse(long userid){

		return null;
	}

	@Override
	public void orderInfoPutRequest(OrderInfoPutRequest orderInfoPutRequest){
		OrderInfo orderInfo = orderInfoRepository.findById(orderInfoPutRequest.getId()).orElseThrow(() -> new IllegalArgumentException("해당 주문 정보가 없습니다. id=" + orderInfoPutRequest.getId()));
		orderInfo.setOrderInfoRequest(orderInfoPutRequest);
		orderInfoRepository.save(orderInfo);
	}

	@Override
	public void orderInfoDelete(long destinationInfoid){
		orderInfoRepository.deleteById(destinationInfoid);
	}

}