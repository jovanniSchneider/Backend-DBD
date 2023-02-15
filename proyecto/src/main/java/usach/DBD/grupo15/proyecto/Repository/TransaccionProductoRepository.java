package usach.DBD.grupo15.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usach.DBD.grupo15.proyecto.Model.Transaccion;
import usach.DBD.grupo15.proyecto.Model.TransaccionProducto;

public interface TransaccionProductoRepository extends JpaRepository<TransaccionProducto,Long> {
}
