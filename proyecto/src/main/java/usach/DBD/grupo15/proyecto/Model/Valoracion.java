package usach.DBD.grupo15.proyecto.Model;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import javax.persistence.*;

@Entity
@Table(name = "valoracion")
public class Valoracion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_valoracion")
    private Long id_valoracion;
    private float puntaje;
    private String Comentario;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_pyme")
    private Pyme pyme;

    public Valoracion() {
    }

    public Long getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(Long id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pyme getPyme() {
        return pyme;
    }

    public void setPyme(Pyme pyme) {
        this.pyme = pyme;
    }
}
