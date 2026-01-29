package org.example.ordersservice.Repository;

import org.example.ordersservice.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
}
