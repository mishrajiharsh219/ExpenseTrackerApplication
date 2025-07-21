package com.example.UserService.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@JsonNaming(com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoDTO {

    @JsonProperty("user_id")
    @NonNull
    private String userId;

    @JsonProperty("first_name")
    @NonNull
    private String firstName;

    @JsonProperty("last_name")
    @NonNull
    private String lastName;

    @JsonProperty("phone_number")
    @NonNull
    private Long phoneNumber;

    @JsonProperty("email")
    @NonNull
    private String email;

    @JsonProperty("profile_pic")
    private String profilePic;

    public UserInfo transformToUserInfo() {
        return UserInfo.builder()
                .firstName(firstName)
                .lastName(lastName)
                .userId(userId)
                .email(email)
                .profilePic(profilePic)
                .phoneNumber(phoneNumber).build();
    }


}
