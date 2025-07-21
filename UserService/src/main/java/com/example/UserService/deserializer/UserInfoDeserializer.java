package com.example.UserService.deserializer;

import com.example.UserService.entities.UserInfoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class UserInfoDeserializer implements Deserializer<UserInfoDTO> {


    @Override
    public UserInfoDTO deserialize (String key,byte[] serialized) {

        ObjectMapper objectMapper = new ObjectMapper();
        UserInfoDTO userInfoDTO = null;
        try {
            userInfoDTO = objectMapper.readValue(serialized, UserInfoDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  userInfoDTO;
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public void close() {
        // No specific resources to close
    }

}
