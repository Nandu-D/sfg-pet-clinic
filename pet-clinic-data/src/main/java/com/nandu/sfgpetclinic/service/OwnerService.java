package com.nandu.sfgpetclinic.service;

import com.nandu.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
