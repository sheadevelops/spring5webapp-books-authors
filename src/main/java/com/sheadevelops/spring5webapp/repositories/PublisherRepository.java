package com.sheadevelops.spring5webapp.repositories;

import com.sheadevelops.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
