package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.TransaccionProducto;
import usach.DBD.grupo15.proyecto.Service.TransaccionProductoService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/TransProduc")
public class TransaccionProductoREST {
    @Autowired
    private TransaccionProductoService transaccionProductoService;

    @GetMapping
    private ResponseEntity<List<TransaccionProducto>> getRelations(){
        return ResponseEntity.ok(transaccionProductoService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<TransaccionProducto> getRelation(@PathVariable Long id){
        return ResponseEntity.ok(transaccionProductoService.getById(id));
    }

    @PostMapping
    private ResponseEntity<TransaccionProducto> saveRelation(@RequestBody TransaccionProducto transaccionProducto){
        try{
            TransaccionProducto transaccionProducto1 = transaccionProductoService.save(transaccionProducto);
            return ResponseEntity.created(new URI("/TransProduc"+transaccionProducto1.getId_transaccion_producto())).
                    body(transaccionProducto1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<TransaccionProducto> updateRelation(@RequestBody TransaccionProducto transaccionProducto,
                                                               @PathVariable Long id){
        try{
            transaccionProducto.setId_transaccion_producto(id);
            TransaccionProducto transaccionProducto1 = transaccionProductoService.save(transaccionProducto);
            return ResponseEntity.created(new URI("/TransProduc"+transaccionProducto1.getId_transaccion_producto())).
                    body(transaccionProducto1);
        }catch (URISyntaxException e){
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteRelation(@PathVariable Long id){
        try{
            transaccionProductoService.deleteById(id);
            return new ResponseEntity<Long>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
