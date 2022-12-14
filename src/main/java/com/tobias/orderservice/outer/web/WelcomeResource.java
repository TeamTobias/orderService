package com.tobias.orderservice.outer.web;

import com.tobias.orderservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WelcomeResource {

	private final Environment environment;

	@Operation(summary = "웰컴 메시지")
	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@GetMapping("/welcome")
	public ResponseEntity<ResponseMessage> welcome(){
		return ResponseEntity.ok(new ResponseMessage(environment.getProperty("welcome.message")));
	}

}