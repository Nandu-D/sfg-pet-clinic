package com.nandu.sfgpetclinic.services;

import com.nandu.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
