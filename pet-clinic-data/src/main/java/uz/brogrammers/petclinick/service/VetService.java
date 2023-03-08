package uz.brogrammers.petclinick.service;

import uz.brogrammers.petclinick.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long> {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}