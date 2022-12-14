package com.tobias.orderservice.outer.dto;

import lombok.Data;

@Data
public class DestinationInfoResponse {

    private AddressVoResponse addressVoResponse;
    private ConsigneeVoResponse consigneeVoResponse;

}
