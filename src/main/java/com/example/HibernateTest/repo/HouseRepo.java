package com.example.HibernateTest.repo;

import com.example.HibernateTest.models.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepo extends JpaRepository<House, Long> {
}
