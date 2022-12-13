package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.outer.dto.OrderInfoPutRequest;
import com.tobias.orderservice.outer.dto.OrderInfoRequest;
import com.tobias.orderservice.outer.dto.OrderInfoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderinfo")
public class OrderInfoResource {


	@PostMapping("/v1")
	public ResponseEntity<String> orderInfoRequest(@RequestBody OrderInfoRequest orderInfoRequest){
		return null;
	}

	@GetMapping("/v1/{userid}")
	public ResponseEntity<List<OrderInfoResponse>> orderInfoResponse(@PathVariable long userid){
		return null;
	}

	@PutMapping("/v1")
	public ResponseEntity<String> orderInfoPutRequest(@RequestBody OrderInfoPutRequest orderInfoPutRequest){
		return null;
	}

	@DeleteMapping("/v1/{destinationInfoid}")
	public ResponseEntity<String> orderInfoDelete(@PathVariable long destinationInfoid){
		return null;
	}

}