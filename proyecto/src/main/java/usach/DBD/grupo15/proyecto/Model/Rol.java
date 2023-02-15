package usach.DBD.grupo15.proyecto.Model;

import javax.persistence.*;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rol")

    private long id_rol;
    private String tipo_rol;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Rol(long id_rol, String tipo_rol, User user) {
        this.id_rol = id_rol;
        this.tipo_rol = tipo_rol;
        this.user = user;
    }

    public Rol() {
    }


    public long getId_rol() {
        return id_rol;
    }

    public void setId_rol(long id_rol) {
        this.id_rol = id_rol;
    }

    public String getTipo_rol() {
        return tipo_rol;
    }

    public void setTipo_rol(String tipo_role) {
        this.tipo_rol = tipo_role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
