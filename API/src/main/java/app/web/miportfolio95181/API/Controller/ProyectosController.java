package app.web.miportfolio95181.API.Controller;

import app.web.miportfolio95181.API.Entity.Proyectos;
import app.web.miportfolio95181.API.Entity.Skills;
import app.web.miportfolio95181.API.Service.ProyectosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {

    private final ProyectosService proyectosService;

    public ProyectosController(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerProyecto() {
        List<Proyectos> proyectos = proyectosService.buscarProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarProyecto(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectosService.editarProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Proyectos> agregarProyecto(@RequestBody Proyectos proyectos) {
        Proyectos nuevoProyectos = proyectosService.agregarProyectos(proyectos);
        return new ResponseEntity<>(nuevoProyectos, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id) {
        proyectosService.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

