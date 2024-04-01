package com.example.HibernateTest.services;

import com.example.HibernateTest.models.House;
import com.example.HibernateTest.models.Owner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseOwnerService {
    private final HouseService houseService;
    private final OwnerService ownerService;

    public House setOwner(Long id, Owner owner){
        House house = houseService.getHouse(id);
        house.setOwners(List.of(ownerService.getOwner(owner.getId())));
        return houseService.updateHouse(house);
    }

    public Owner setHouse(Long id, House house){
        Owner owner = ownerService.getOwner(id);
        owner.getHouses().add(houseService.getHouse(house.getId()));
        return ownerService.updateOwner(owner);
    }

}
