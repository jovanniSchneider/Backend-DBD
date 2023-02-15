package usach.DBD.grupo15.proyecto.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import usach.DBD.grupo15.proyecto.Model.Transaccion;
import usach.DBD.grupo15.proyecto.Service.TransaccionService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Transaccion")
public class TransaccionREST {
    @Autowired
    private  TransaccionService transaccionService;

    @GetMapping
    private ResponseEntity<List<Transaccion>> getAllTransaccion() {
        return ResponseEntity.ok(transaccionService.findAll());
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Transaccion>> getTransaccion(@PathVariable Long id){
        return ResponseEntity.ok(transaccionService.findById(id));
    }

    @PostMapping
    private ResponseEntity<Transaccion> saveTransaccion(@RequestBody Transaccion transaccion){
        try {
            Transaccion transaccion1 = transaccionService.save(transaccion);
            return ResponseEntity.created(new URI("/Transaccion"+transaccion1.getId_Transaccion())).body(transaccion1);

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping(value = "/{id}")
    private ResponseEntity<Transaccion> updateTransaccion(@RequestBody Transaccion transaccion, @PathVariable Long id){
        try {
            transaccion.setId_Transaccion(id);
            Transaccion transaccion1 = transaccionService.save(transaccion);
            return ResponseEntity.created(new URI("/Transaccion"+transaccion1.getId_Transaccion())).body(transaccion1);

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<Long> deleteTransaccion(@PathVariable Long id){
        try{
            transaccionService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
