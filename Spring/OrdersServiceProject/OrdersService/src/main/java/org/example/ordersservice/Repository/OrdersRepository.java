package org.example.ordersservice.Repository;

import org.example.ordersservice.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface OrdersRepository extends JpaRepository<Orders,Long> {
//    Double sumTotalCostByCreatedAtBetween(LocalDateTime since, LocalDateTime until);

    @Query("""
           SELECT COALESCE(SUM(o.totalCost), 0)
           FROM Orders o
           WHERE o.createdAt BETWEEN :since AND :until
           """)
    Double getTotalCostBetween(
            @Param("since") LocalDateTime since,
            @Param("until") LocalDateTime until
    );


    @Query("""
        SELECT COALESCE(SUM(o.quantity), 0)
        FROM Orders o
        WHERE o.productId = :productId
          AND o.createdAt BETWEEN :start AND :end
    """)
    Integer sumQuantityByProductAndDate(
            @Param("productId") Long productId,
            @Param("start") LocalDateTime start,
            @Param("end") LocalDateTime end
    );
}

