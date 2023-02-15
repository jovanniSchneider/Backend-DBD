package usach.DBD.grupo15.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usach.DBD.grupo15.proyecto.Model.CarritoStock;

import java.util.List;

public interface CarritoStockRepository extends JpaRepository<CarritoStock,Long> {
}
