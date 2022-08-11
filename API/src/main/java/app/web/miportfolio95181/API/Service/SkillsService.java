package app.web.miportfolio95181.API.Service;

import app.web.miportfolio95181.API.Entity.Skills;
import app.web.miportfolio95181.API.Repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {

    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    public Skills agregarSkills(Skills skills) {
        return skillsRepo.save(skills);
    }
    public Skills editarSkills(Skills skills) {
        return skillsRepo.save(skills);
    }
    public List<Skills> buscarSkills() {
        return skillsRepo.findAll();
    }
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

}

