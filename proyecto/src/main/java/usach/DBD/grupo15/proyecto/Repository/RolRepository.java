package usach.DBD.grupo15.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usach.DBD.grupo15.proyecto.Model.Rol;

import java.util.List;

public interface RolRepository extends JpaRepository<Rol,Long> {
    Rol findByUser_Email(String email);
}
