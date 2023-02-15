package usach.DBD.grupo15.proyecto.Model;

import javax.persistence.*;


@Entity
@Table(name = "Transaccion_Producto")
public class TransaccionProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Transaccion_Producto")

    private long id_transaccion_producto;

    @ManyToOne
    @JoinColumn(name = "transaccion_id_transaccion")
    public Transaccion transaccion;

    public Transaccion getTransaccion() { return transaccion; }

    public void setTransaccion(Transaccion transaccion) {this.transaccion = transaccion;}

    @ManyToOne
    @JoinColumn(name = "producto_codigo_pr")
    public Producto producto;

    public Producto getProducto() {return producto;}

    public void setProducto(Producto producto) {this.producto = producto;}

    public TransaccionProducto(){
    }

    public long getId_transaccion_producto() {return id_transaccion_producto;}

    public void setId_transaccion_producto(long id_transaccion_producto) {
        this.id_transaccion_producto = id_transaccion_producto;
    }
}
