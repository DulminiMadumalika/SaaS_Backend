package com.uom.saas.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uom.saas.entiry.Provider;

@Repository
public interface ProviderRepository extends MongoRepository<Provider, ObjectId>{

}
