package de.spring.demo.repo;

import de.spring.demo.entity.MyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "myEntities", path = "myEntities")
public interface MyRepository extends MongoRepository<MyEntity, String> {

}
