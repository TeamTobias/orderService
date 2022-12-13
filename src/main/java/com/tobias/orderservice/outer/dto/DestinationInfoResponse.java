package com.tobias.orderservice.outer.dto;

import com.rabbitmq.client.Address;
import lombok.Data;

@Data
public class DestinationInfoResponse {

    private AddressVoResponse addressVoResponse;
    private ConsigneeVoResponse consigneeVoResponse;

}
