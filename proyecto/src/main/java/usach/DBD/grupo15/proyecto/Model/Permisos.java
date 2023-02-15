package usach.DBD.grupo15.proyecto.Model;

//import org.springframework.beans.factory.annotation.Value;
import javax.persistence.*;
//import java.sql.Date;

@Entity
@Table(name="permisos")
public class Permisos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_permiso")
    private long id_permiso;
    private String tipo;


    public Permisos(long id_permiso, String nombre) {
        this.id_permiso = id_permiso;
        this.tipo = nombre;
    }

    public Permisos() {
    }

    public long getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(long id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
