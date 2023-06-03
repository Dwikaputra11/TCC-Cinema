package com.spring.binar.challenge_5.dto;

import com.spring.binar.challenge_5.models.Costumer;
import com.spring.binar.challenge_5.models.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CostumerUpdateRequestDTO {
    private Integer costumerId;
    private String firstName;
    private String lastName;
    private String email;
    private String photoUrl;
    private Integer userId;

    public Costumer toCostumer(User user){
        return Costumer.builder()
                .costumerId(this.costumerId)
                .firstName(this.getFirstName())
                .lastName(this.getLastName())
                .email(this.getEmail())
                .photoUrl(this.getPhotoUrl())
                .userProfile(user)
                .lastUpdate(System.currentTimeMillis())
              .build();
    }
}
