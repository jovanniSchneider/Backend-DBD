package usach.DBD.grupo15.proyecto.Model;

import org.springframework.beans.factory.annotation.Value;
import usach.DBD.grupo15.proyecto.Model.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pyme")
public class Pyme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pyme")
    private Long id_pyme;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Pyme() {
    }

    public Long getId_pyme() {
        return id_pyme;
    }

    public void setId_pyme(Long id_pyme) {
        this.id_pyme = id_pyme;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
