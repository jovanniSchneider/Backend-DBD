package usach.DBD.grupo15.proyecto.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Carrito;
import usach.DBD.grupo15.proyecto.Model.CarritoStock;
import usach.DBD.grupo15.proyecto.Model.Producto;
import usach.DBD.grupo15.proyecto.Model.Stock;
import usach.DBD.grupo15.proyecto.Service.CarritoService;
import usach.DBD.grupo15.proyecto.Service.CarritoStockService;
import usach.DBD.grupo15.proyecto.Service.StockService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Carrito")
public class CarritoREST {
    @Autowired
    private CarritoService carritoService;
    @Autowired
    private CarritoStockService carritoStockService;
    @GetMapping
    private ResponseEntity<List<Carrito>> getAllCarritos(){
        return ResponseEntity.ok(carritoService.findAll());
    }
    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Carrito>> getCarrito(@PathVariable Long id){
        return ResponseEntity.ok(carritoService.findById(id));
    }
    @PostMapping
    private ResponseEntity<Carrito> saveCarrito(@RequestBody Carrito carrito){
        try{
            Carrito carrito1 = carritoService.save(carrito);
            return ResponseEntity.created(new URI("/Carrito"+carrito1.getId_carrito())).body(carrito1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping(value = "/{id}")
    private ResponseEntity<Carrito> updateCarrito(@RequestBody Carrito carrito,@PathVariable Long id){
        try{
            carrito.setId_carrito(id);
            Carrito carrito1 = carritoService.save(carrito);
            return ResponseEntity.created(new URI("/Carrito" + carrito1.getId_carrito())).body(carrito1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteCarrito(@PathVariable Long id){
        try {
            carritoService.deleteById(id);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
