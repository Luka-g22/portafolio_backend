package app.web.miportfolio95181.API.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter@Setter
public class Proyectos {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idProyecto;
    private String nombreProyecto;
    private String fotoProyecto;
    private String UrlProyecto;

    public Proyectos() {
    }

    public Proyectos(Long idProyecto, String nombreProyecto, String fotoProyecto, String urlProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.fotoProyecto = fotoProyecto;
        UrlProyecto = urlProyecto;
    }
}
