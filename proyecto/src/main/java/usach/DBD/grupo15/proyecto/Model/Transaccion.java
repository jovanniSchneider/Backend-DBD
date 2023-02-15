package usach.DBD.grupo15.proyecto.Model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "Transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Transaccion", nullable = false)
    private Long id_Transaccion;

    private Date Fecha;

    @ManyToOne
    @JoinColumn(name = "user_id_user")
    public User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "pyme_id_pyme")
    public Pyme pyme;

    public Pyme getPyme() {
        return pyme;
    }

    public void setPyme(Pyme pyme) {
        this.pyme = pyme;
    }
    @ManyToOne
    @JoinColumn(name = "mediodepago_codigo_pago")
    public Mediodepago mediodepago;

    public Mediodepago getMediodepago() { return mediodepago; }

    public void setMediodepago(Mediodepago mediodepago) { this.mediodepago = mediodepago; }

    public Transaccion(long id_Transaccion, Date Fecha){
        this.id_Transaccion = id_Transaccion;
        this.Fecha = Fecha;
    }
    public Transaccion(){
    }

    public Long getId_Transaccion() {return id_Transaccion;}

    public void setId_Transaccion(Long id_Transaccion) {this.id_Transaccion = id_Transaccion;}

    public Date getFecha() {return Fecha;}

    public void setFecha(Date fecha) {Fecha = fecha;}
}

