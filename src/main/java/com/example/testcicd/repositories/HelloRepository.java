package com.example.testcicd.repositories;

import com.example.testcicd.models.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Long> {
}
