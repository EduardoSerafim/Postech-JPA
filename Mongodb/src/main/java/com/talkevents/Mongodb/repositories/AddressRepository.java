package com.talkevents.Mongodb.repositories;

import com.talkevents.Mongodb.documents.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
