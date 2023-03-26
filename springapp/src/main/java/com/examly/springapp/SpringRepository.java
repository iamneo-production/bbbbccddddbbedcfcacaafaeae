package com.examly.springapp;
import com.examly.springapp.model.Springapp;
import org.springframework.data.repository.CrudRepository;
public interface SpringRepository extends CrudRepository<Springapp,Long> {
    
}

