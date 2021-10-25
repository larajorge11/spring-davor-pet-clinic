package petclinicdavor.service;

import petclinicdavor.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastName);

}
