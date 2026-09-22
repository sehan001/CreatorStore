package org.creatorstore.creatorstore.repositories;

import org.creatorstore.creatorstore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
