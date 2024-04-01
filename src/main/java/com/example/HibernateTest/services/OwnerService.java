package com.example.HibernateTest.services;

import com.example.HibernateTest.models.House;
import com.example.HibernateTest.models.Owner;
import com.example.HibernateTest.repo.OwnerRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerService {
    private final OwnerRepo ownerRepo;

    public Owner getOwner(Long id){
        return ownerRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    public Owner createOwner(Owner owner){
        return ownerRepo.save(owner);
    }

    public Owner updateOwner(Owner owner){
        return ownerRepo.save(owner);
    }
}
