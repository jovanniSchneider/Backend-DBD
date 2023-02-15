package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.CarritoStock;
import usach.DBD.grupo15.proyecto.Service.CarritoStockService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/CarritoStock")
public class CarritoStockREST {
    @Autowired
    private CarritoStockService carritoStockService;

    @GetMapping
    private ResponseEntity<List<CarritoStock>> getRelations(){
        return ResponseEntity.ok(carritoStockService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<CarritoStock> getRelation(@PathVariable Long id){
        return ResponseEntity.ok(carritoStockService.getById(id));
    }

    @PostMapping
    private ResponseEntity<CarritoStock> postRelation(@RequestBody CarritoStock carritoStock){
        try{
            CarritoStock carritoStock1 = carritoStockService.save(carritoStock);
            return ResponseEntity.created(new URI("/CarritoStock"+carritoStock1.getCodigo_carrito_stock())).body(carritoStock1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<CarritoStock> updateRelation(@RequestBody CarritoStock carritoStock, @PathVariable Long id){
        try{
            carritoStock.setCodigo_carrito_stock(id);
            CarritoStock carritoStock1 = carritoStockService.save(carritoStock);
            return ResponseEntity.created(new URI("/CarritoStock"+carritoStock1.getCodigo_carrito_stock())).body(carritoStock1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteRelation(@PathVariable Long id){
        try{
            carritoStockService.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
