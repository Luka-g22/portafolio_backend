
package com.demo.SpringBoot.repository;

import com.demo.SpringBoot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    
}
