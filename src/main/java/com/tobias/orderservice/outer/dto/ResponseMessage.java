package com.tobias.orderservice.outer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseMessage {
    private String message = "success";

    public ResponseMessage(String message) {
        this.message = message;
    }
}
