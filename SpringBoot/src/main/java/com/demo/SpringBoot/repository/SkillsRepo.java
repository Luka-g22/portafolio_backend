
package com.demo.SpringBoot.repository;

import com.demo.SpringBoot.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills,Long>{
    
}
