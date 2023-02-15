package usach.DBD.grupo15.proyecto.Model;

import javax.persistence.*;

@Entity
@Table(name="carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_carrito")
    private Long id_carrito;
    private int total;

    public Carrito(Long id_carrito, int total) {
        this.id_carrito = id_carrito;
        this.total = total;
    }

    public Carrito() {
    }

    public Long getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Long id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
