package com.spring_project.repositories;

import com.spring_project.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInterface extends JpaRepository<Payment, Long> {
}
