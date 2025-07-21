package com.bookshop.bookshop.repositories;
import com.bookshop.bookshop.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username); //find by username
}
