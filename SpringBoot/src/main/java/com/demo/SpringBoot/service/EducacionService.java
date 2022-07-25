package com.demo.SpringBoot.service;

import com.demo.SpringBoot.model.Educacion;
import com.demo.SpringBoot.repository.EducacionRepo;
import exception.UserNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {

    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion agregarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion editarEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

}