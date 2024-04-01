package com.example.HibernateTest.services;

import com.example.HibernateTest.models.House;
import com.example.HibernateTest.models.Owner;
import com.example.HibernateTest.repo.HouseRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseService {
    private final HouseRepo houseRepo;

    public House getHouse(Long id){
        return houseRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public House createHouse(House house){
        return houseRepo.save(house);
    }

    public House updateHouse(House house){
        return houseRepo.save(house);
    }
}
