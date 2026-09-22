package org.creatorstore.creatorstore.repositories;

import org.creatorstore.creatorstore.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
