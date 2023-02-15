package usach.DBD.grupo15.proyecto.Model;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @Column(name = "codigo_pr", nullable = false)
    private Long codigo_pr;
    private String name;
    private String tipo_de_producto;
    private String restriccion;

    public Producto(String name, String tipo_de_producto, String restriccion) {
        this.name = name;
        this.tipo_de_producto = tipo_de_producto;
        this.restriccion = restriccion;
    }

    public Producto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo_de_producto() {
        return tipo_de_producto;
    }

    public void setTipo_de_producto(String tipo_de_producto) {
        this.tipo_de_producto = tipo_de_producto;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }

    public Long getCodigo_pr() {
        return codigo_pr;
    }

    public void setCodigo_pr(Long codigo_pr) {
        this.codigo_pr = codigo_pr;
    }
}
