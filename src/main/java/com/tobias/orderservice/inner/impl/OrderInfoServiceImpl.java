package com.tobias.orderservice.inner.impl;

import com.tobias.orderservice.inner.service.OrderInfoService;
import com.tobias.orderservice.outer.repository.OrderInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderInfoServiceImpl implements OrderInfoService {

	private final OrderInfoRepository orderInfoRepository;



	/**
	 * 
	 * @param orderInfoRequest
	 */
	public void orderInfoRequest(OrderInfoRequest orderInfoRequest){

	}

	/**
	 * 
	 * @param userid
	 */
	public List<OrderInfoResponse> orderInfoResponse(long userid){
		return null;
	}

	/**
	 * 
	 * @param orderInfoPutRequest
	 */
	public void orderInfoPutRequest(OrderInfoPutRequest orderInfoPutRequest){

	}

	/**
	 * 
	 * @param destinationInfoid
	 */
	public void orderInfoDelete(long destinationInfoid){

	}

}