package usach.DBD.grupo15.proyecto.Model;

import javax.persistence.*;

@Entity
@Table(name="rol_permisos")

public class RolPermisos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rol_permiso")
    private long id_rol_permiso;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_permiso")
    private Permisos permisos;

    public RolPermisos(long id_rol_permiso, Rol rol, Permisos permisos) {
        this.id_rol_permiso = id_rol_permiso;
        this.rol = rol;
        this.permisos = permisos;
    }

    public RolPermisos() {
    }

    public long getId_rol_permiso() {
        return id_rol_permiso;
    }

    public void setId_rol_permiso(long id_rol_permiso) {
        this.id_rol_permiso = id_rol_permiso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Permisos getPermisos() {
        return permisos;
    }

    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }

}
