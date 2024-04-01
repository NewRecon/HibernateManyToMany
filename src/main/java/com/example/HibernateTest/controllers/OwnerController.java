package com.example.HibernateTest.controllers;

import com.example.HibernateTest.models.House;
import com.example.HibernateTest.models.Owner;
import com.example.HibernateTest.services.HouseOwnerService;
import com.example.HibernateTest.services.HouseService;
import com.example.HibernateTest.services.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owners")
@RequiredArgsConstructor
public class OwnerController {
    private final OwnerService ownerService;
    private final HouseOwnerService houseOwnerService;

    @PostMapping
    public ResponseEntity<Owner> createOwner(@RequestBody Owner owner){
        return ResponseEntity.ok(ownerService.createOwner(owner));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Owner> addHouse(@PathVariable Long id, @RequestBody House house){
        return ResponseEntity.ok(houseOwnerService.setHouse(id,house));
    }
}
