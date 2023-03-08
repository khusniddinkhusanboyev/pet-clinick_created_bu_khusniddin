package uz.brogrammers.petclinick.service;

import uz.brogrammers.petclinick.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}