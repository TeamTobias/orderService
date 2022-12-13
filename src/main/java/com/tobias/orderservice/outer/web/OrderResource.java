package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.inner.service.OrderService;
import com.tobias.orderservice.outer.dto.OrderRequest;
import com.tobias.orderservice.outer.dto.OrderResponse;
import com.tobias.orderservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600, allowCredentials = "true", exposedHeaders = "Authorization")
@RequestMapping("/order")
public class OrderResource {

    private final OrderService orderService;

    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    @PostMapping("/v1/orderRequest")
    public ResponseEntity<String> orderRequest(@RequestBody OrderRequest orderRequest) {
		orderService.orderRequest(orderRequest);
		return ResponseEntity.ok("success");
    }


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    @GetMapping("/v1/orderResponse/{userid}")
    public ResponseEntity<List<OrderResponse>> orderResponse(@PathVariable long userid) {
        return null;
    }


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    @DeleteMapping("/v1/orderDelete/{orderid}")
    public ResponseEntity<String> orderDelete(@PathVariable long orderid) {
        return null;
    }

    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderResponse.class))))
    @GetMapping("/v1/orderSearchRequest/{catalogname}")
    public ResponseEntity<List<OrderResponse>> orderSearchRequest(@RequestBody String catalogname) {
        return null;
    }


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    @PutMapping("/v1/purchaseConfirmRequest/{orderitemid}")
    public ResponseEntity<String> purchaseConfirmRequest(@PathVariable long orderitemid) {
        return null;
    }

}