package usach.DBD.grupo15.proyecto.Model;

import javax.persistence.*;

@Entity
@Table(name = "medio_de_pago")
public class Mediodepago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_pago", nullable = false )
    private long codigo_pago;
    private String tipo;

    public Mediodepago(long codigo_pago, String tipo){
        this.codigo_pago = codigo_pago;
        this.tipo = tipo;
    }

    public Mediodepago() {

    }
    //getter and setters

    public long getCodigo_pago() {
        return codigo_pago;
    }

    public void setCodigo_pago(long codigo_pago) {
        this.codigo_pago = codigo_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}



