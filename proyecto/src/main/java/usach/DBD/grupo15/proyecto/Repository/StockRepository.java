package usach.DBD.grupo15.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usach.DBD.grupo15.proyecto.Model.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
