package com.tobias.orderservice.inner.domain;

import com.tobias.orderservice.outer.dto.OrderInfoPutRequest;
import com.tobias.orderservice.outer.dto.OrderInfoRequest;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class OrderInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long userid;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<DestinationInfo> destinationInfos = new HashSet<>();


    public void setOrderInfoRequest(OrderInfoPutRequest orderInfoPutRequest) {
        for (DestinationInfo destinationInfo : destinationInfos)
            if(destinationInfo.getId() == orderInfoPutRequest.getDestinationInfoid()) destinationInfo.setOrderInfoRequest(orderInfoPutRequest);
    }


    public OrderInfo(OrderInfoRequest orderInfoRequest) {
        this.userid = orderInfoRequest.getUserid();
        this.destinationInfos = orderInfoRequest.getDestinationInfoRequests().stream().map(DestinationInfo::new).collect(Collectors.toSet());
    }
}