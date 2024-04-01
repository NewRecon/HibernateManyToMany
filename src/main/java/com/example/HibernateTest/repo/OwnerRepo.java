package com.example.HibernateTest.repo;

import com.example.HibernateTest.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepo extends JpaRepository<Owner, Long> {
}
