package com.tobias.orderservice.inner.impl;

import com.tobias.orderservice.inner.domain.Order;
import com.tobias.orderservice.inner.domain.OrderInfo;
import com.tobias.orderservice.inner.service.OrderInfoService;
import com.tobias.orderservice.outer.dto.OrderInfoPutRequest;
import com.tobias.orderservice.outer.dto.OrderInfoRequest;
import com.tobias.orderservice.outer.dto.OrderInfoResponse;
import com.tobias.orderservice.outer.repository.OrderInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderInfoServiceImpl implements OrderInfoService {

	private final OrderInfoRepository orderInfoRepository;



	@Override
	public void orderInfoRequest(OrderInfoRequest orderInfoRequest){

	}

	@Override
	public List<OrderInfoResponse> orderInfoResponse(long userid){
		List<OrderInfo> orderInfos = orderInfoRepository.findAllByUserid(userid);
		return orderInfos.stream().map(OrderInfoResponse::new).collect(Collectors.toList());
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