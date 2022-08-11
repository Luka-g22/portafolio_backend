package app.web.miportfolio95181.API.Service;

import app.web.miportfolio95181.API.Entity.Proyectos;
import app.web.miportfolio95181.API.Repository.ProyectosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectosService {

    private final ProyectosRepo proyectosRepo;

    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }
    public Proyectos agregarProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }
    public Proyectos editarProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }
    public List<Proyectos> buscarProyectos() {
        return proyectosRepo.findAll();
    }
    public void borrarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }

}

