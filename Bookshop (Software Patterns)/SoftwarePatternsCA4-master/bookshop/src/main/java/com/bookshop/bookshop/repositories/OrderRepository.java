package com.bookshop.bookshop.repositories;

import com.bookshop.bookshop.models.Customer;
import com.bookshop.bookshop.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
	//get all orders by specific customer
    List<Order> findByCustomer(Customer customer);
}
