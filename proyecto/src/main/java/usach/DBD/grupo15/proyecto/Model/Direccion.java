package usach.DBD.grupo15.proyecto.Model;


import javax.persistence.*;

@Entity
@Table(name="direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_direccion")
    private Long id_direccion;
    private String calle;
    private int numero;
    private String comuna;
    private String region;

    public Direccion(Long id_direccion, String calle, int numero, String comuna, String region) {
        this.id_direccion = id_direccion;
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.region = region;
    }

    public Direccion() {
    }

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
