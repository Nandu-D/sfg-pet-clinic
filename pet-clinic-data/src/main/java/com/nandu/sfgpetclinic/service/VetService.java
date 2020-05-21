package com.nandu.sfgpetclinic.service;

import com.nandu.sfgpetclinic.model.Pet;
import com.nandu.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
