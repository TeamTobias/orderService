package com.tobias.orderservice.outer.dto;

import lombok.Data;

@Data
public class DestinationInfoRequest {

    private AddressVoRequest addressVoRequest;
    private ConsigneeVoRequest consigneeVoRequest;

}
