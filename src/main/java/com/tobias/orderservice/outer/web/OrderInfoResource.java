package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.outer.dto.*;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderinfo")
public class OrderInfoResource {


	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1")
	public ResponseEntity<String> orderInfoRequest(@RequestBody OrderInfoRequest orderInfoRequest){
		return null;
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderInfoResponse.class))))
	@GetMapping("/v1/{userid}")
	public ResponseEntity<List<OrderInfoResponse>> orderInfoResponse(@PathVariable long userid){
		return null;
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PutMapping("/v1")
	public ResponseEntity<String> orderInfoPutRequest(@RequestBody OrderInfoPutRequest orderInfoPutRequest){
		return null;
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@DeleteMapping("/v1/{destinationInfoid}")
	public ResponseEntity<String> orderInfoDelete(@PathVariable long destinationInfoid){
		return null;
	}

}