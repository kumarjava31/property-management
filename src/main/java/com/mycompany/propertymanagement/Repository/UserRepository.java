package com.mycompany.propertymanagement.Repository;


import com.mycompany.propertymanagement.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {


}
