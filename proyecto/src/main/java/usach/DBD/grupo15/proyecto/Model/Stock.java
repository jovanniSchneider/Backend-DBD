package usach.DBD.grupo15.proyecto.Model;

import usach.DBD.grupo15.proyecto.Model.Pyme;

import javax.persistence.*;

@Entity
@Table(name = "Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_stock", nullable = false )
    private long id_stock;
    private int cantidad;
    private int precio;
    @ManyToOne
    @JoinColumn(name = "producto_codigo_pr")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_pyme")
    private Pyme pyme;

    public Producto getProducto() {
        return producto;
    }

    //Foreaneous key from pyme, we need create pyme first

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Stock(long id_stock, int cantidad, int precio){
        this.id_stock = id_stock;
        this.cantidad = cantidad;
        this.precio = precio;

    }



    public Stock(){
    }
    public long getId_stock() {
        return id_stock;
    }
    public void setId_stock(long id_stock) {
        this.id_stock = id_stock;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
