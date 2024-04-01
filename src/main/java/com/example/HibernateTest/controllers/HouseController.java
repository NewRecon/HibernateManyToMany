package com.example.HibernateTest.controllers;

import com.example.HibernateTest.models.House;
import com.example.HibernateTest.models.Owner;
import com.example.HibernateTest.services.HouseOwnerService;
import com.example.HibernateTest.services.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/houses")
@RequiredArgsConstructor
public class HouseController {
    private final HouseService houseService;
    private final HouseOwnerService houseOwnerService;

    @PostMapping
    public ResponseEntity<House> createHouse(@RequestBody House house){
        return ResponseEntity.ok(houseService.createHouse(house));
    }

    @PutMapping("/{id}")
    public ResponseEntity<House> addOwner(@PathVariable Long id, @RequestBody Owner owner){
        return ResponseEntity.ok(houseOwnerService.setOwner(id,owner));
    }

}
