package app.web.miportfolio95181.API.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter @Setter
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private String fechaExp;
    private String descExp;
    private String fotoExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String fechaExp, String descExp, String fotoExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.fotoExp = fotoExp;
    }

}



