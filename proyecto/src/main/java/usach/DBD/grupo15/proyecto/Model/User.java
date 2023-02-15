package usach.DBD.grupo15.proyecto.Model;

import org.springframework.beans.factory.annotation.Value;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user",nullable = false)
    private Long id_user;
    private String username;
    private String email;
    private String password;
    private int edad;

    @ManyToOne
    @JoinColumn(name = "id_carrito")
    private Carrito carrito;
    @ManyToOne
    @JoinColumn(name="id_direccion")
    private Direccion direccion;

    public User(String username, String email, String password, int edad, Carrito carrito, Direccion direccion) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.edad = edad;
        this.carrito = carrito;
        this.direccion = direccion;
    }

    public User() {
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
