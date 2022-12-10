package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.outer.dto.OrderInfoPutRequest;
import com.tobias.orderservice.outer.dto.OrderInfoRequest;
import com.tobias.orderservice.outer.dto.OrderInfoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderInfoResource {


	public ResponseEntity<String> orderInfoRequest(@RequestBody OrderInfoRequest orderInfoRequest){
		return null;
	}

	public ResponseEntity<List<OrderInfoResponse>> orderInfoResponse(@PathVariable long userid){
		return null;
	}

	public ResponseEntity<String> orderInfoPutRequest(@RequestBody OrderInfoPutRequest orderInfoPutRequest){
		return null;
	}

	public ResponseEntity<String> orderInfoDelete(@PathVariable long destinationInfoid){
		return null;
	}

}