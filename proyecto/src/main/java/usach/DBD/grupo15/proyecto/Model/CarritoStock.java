package usach.DBD.grupo15.proyecto.Model;


import javax.persistence.*;

@Entity
@Table(name = "carrito_stock")
public class CarritoStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_carrito_stock;

    @ManyToOne
    @JoinColumn(name = "id_carrito")
    private Carrito carrito;
    //Debemos crear los otros modelos primero
    @ManyToOne
    @JoinColumn(name = "id_stock")
    private Stock stock;

    public CarritoStock() {
    }

    public long getCodigo_carrito_stock() {
        return codigo_carrito_stock;
    }

    public void setCodigo_carrito_stock(long codigo_carrito_stock) {
        this.codigo_carrito_stock = codigo_carrito_stock;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
