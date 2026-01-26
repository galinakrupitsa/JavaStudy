package org.example.ordersservice.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders_service")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @PrimaryKeyJoinColumn
    public Long id;
    public Long userId;
    public Long productId;
    public Long totalPrice;

}
