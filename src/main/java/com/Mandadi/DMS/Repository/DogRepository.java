package com.Mandadi.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Mandadi.DMS.Models.Dog;
/**
 * 
 * @author s555303
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
