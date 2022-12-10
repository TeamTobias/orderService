package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.outer.dto.OrderRequest;
import com.tobias.orderservice.outer.dto.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderResource {


	public ResponseEntity<String> orderRequest(@RequestBody OrderRequest orderRequest){
		return null;
	}

	public ResponseEntity<List<OrderResponse>> orderResponse(@PathVariable long userid){
		return null;
	}

	public ResponseEntity<String> orderDelete(@PathVariable long orderid){
		return null;
	}

	public ResponseEntity<List<OrderResponse>> orderSearchRequest(@RequestBody String catalogname){
		return null;
	}

	public ResponseEntity<String> purchaseConfirmRequest(@PathVariable long orderitemid){
		return null;
	}

}