package com.rak.reference.kafka.consumer.app.config;

import com.rak.reference.kafka.consumer.app.bean.Item;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.Map;

public class ItemDeserializer extends JsonDeserializer<Item> implements Deserializer<Item> {

    public ItemDeserializer() {
        super(Item.class);
    }

    @Override
    public Item deserialize(String topic, byte[] data) {
        return super.deserialize(topic, data);
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        super.configure(configs, isKey);
    }

}
