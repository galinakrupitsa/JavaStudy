package org.example.ordersservice.Client;
import org.example.ordersservice.DTO.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {
    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getUserName(Long userId) {
      String url = "http://localhost:8081/api/v1/user/" + userId;
        UserDTO userDTO = restTemplate.getForObject(url, UserDTO.class);
        return userDTO.getFirstName();
    }
    public String getUserSecondName(Long userId) {
        String url = "http://localhost:8081/api/v1/user/" + userId;
        UserDTO userDTO = restTemplate.getForObject(url, UserDTO.class);
        return userDTO.getSecondName();
    }
}
