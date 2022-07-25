
package com.demo.SpringBoot.repository;

import com.demo.SpringBoot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepo extends JpaRepository<Educacion,Long>{
    
}
