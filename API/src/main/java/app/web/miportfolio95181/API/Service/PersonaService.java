package app.web.miportfolio95181.API.Service;

import app.web.miportfolio95181.API.Entity.Persona;
import app.web.miportfolio95181.API.Repository.PersonaRepo;
import exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

    public Persona agregarPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public Persona editarPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    public Persona buscarPersonaPorId(Long id) {
        return personaRepo.findById(id).orElseThrow(()
                -> new UserNotFoundException("usuario no encontrado"));
    }
}
