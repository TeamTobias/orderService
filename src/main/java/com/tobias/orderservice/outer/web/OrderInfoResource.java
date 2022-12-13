package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.inner.service.OrderInfoService;
import com.tobias.orderservice.outer.dto.*;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderinfo")
@RequiredArgsConstructor
public class OrderInfoResource {

	private final OrderInfoService orderInfoService;


	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1")
	public ResponseEntity<String> orderInfoRequest(@RequestBody OrderInfoRequest orderInfoRequest){
		orderInfoService.orderInfoRequest(orderInfoRequest);
		return ResponseEntity.ok("success");
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderInfoResponse.class))))
	@GetMapping("/v1/{userid}")
	public ResponseEntity<List<OrderInfoResponse>> orderInfoResponse(@PathVariable long userid){
		List<OrderInfoResponse> orderInfoResponses = orderInfoService.orderInfoResponse(userid);
		return ResponseEntity.ok(orderInfoResponses);
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PutMapping("/v1")
	public ResponseEntity<String> orderInfoPutRequest(@RequestBody OrderInfoPutRequest orderInfoPutRequest){
		orderInfoService.orderInfoPutRequest(orderInfoPutRequest);
		return ResponseEntity.ok("OrderInfoPutRequest Success");
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@DeleteMapping("/v1/{destinationInfoid}")
	public ResponseEntity<String> orderInfoDelete(@PathVariable long destinationInfoid){
		orderInfoService.orderInfoDelete(destinationInfoid);
		return ResponseEntity.ok("OrderInfoDelete Success");
	}

}