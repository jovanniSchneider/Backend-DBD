package usach.DBD.grupo15.proyecto.Rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Producto;
import usach.DBD.grupo15.proyecto.Service.ProductoService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Producto")
public class ProductoREST {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    private ResponseEntity<List<Producto>> getAllProductos(){
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Producto>> getProducto(@PathVariable Long id){
        return ResponseEntity.ok(productoService.findById(id));
    }

    @PostMapping
    private ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
        try{
            Producto producto1 = productoService.save(producto);
            return ResponseEntity.created(new URI("/Producto"+producto1.getCodigo_pr())).body(producto1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping(value = "/{id}")
    private ResponseEntity<Producto> updateProducto(@RequestBody Producto producto,@PathVariable Long id){
        try{
            producto.setCodigo_pr(id);
            Producto producto1 = productoService.save(producto);
            return ResponseEntity.created(new URI("/Producto"+producto1.getCodigo_pr())).body(producto1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deteleProducto(@PathVariable Long id){
        try{
            productoService.deleteById(id);
            return new ResponseEntity<Long>(id,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Producto> updateProduct(@RequestBody Producto producto, @PathVariable Long id){
        try{
            producto.setCodigo_pr(id);
            Producto producto1 = productoService.save(producto);
            return ResponseEntity.created(new URI("/Producto"+producto1.getCodigo_pr())).body(producto1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
