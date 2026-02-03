package org.example.ordersservice.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table(name = "orders_service")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @PrimaryKeyJoinColumn
    public Long id;
    @Column(name = "created_at", updatable = false, insertable = true, length = 19)
    private LocalDateTime createdAt;
    public Long userId;
    public String firstName;
    public String secondName;
    public Long productId;
    public Double totalCost;
    @Column(nullable = false)
    public Integer quantity;
}
