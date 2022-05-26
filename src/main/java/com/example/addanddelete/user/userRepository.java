package com.example.addanddelete.user;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository <User, Integer> {

}
