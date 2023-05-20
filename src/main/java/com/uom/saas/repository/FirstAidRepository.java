package com.uom.saas.repository;

import com.uom.saas.entiry.FirstAid;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;


@Repository
public interface FirstAidRepository extends MongoRepository<FirstAid, ObjectId> {
}
