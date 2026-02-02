package org.example.ordersservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class UserDTO {
    private Long id;
    private String firstName;
    private String secondName;
    public UserDTO(Long id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }
}


