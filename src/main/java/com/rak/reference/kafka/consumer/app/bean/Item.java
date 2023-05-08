package com.rak.reference.kafka.consumer.app.bean;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Item {
    private Long id;
    private String key;
    private String name;
}
